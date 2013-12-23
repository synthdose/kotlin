/*
 * Copyright 2010-2013 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.jet.di;

import com.intellij.openapi.project.Project;
import org.jetbrains.jet.lang.resolve.BindingTrace;
import org.jetbrains.jet.lang.resolve.java.JavaClassFinderImpl;
import org.jetbrains.jet.lang.resolve.java.resolver.TraceBasedExternalSignatureResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.TraceBasedJavaResolverCache;
import org.jetbrains.jet.lang.resolve.java.resolver.TraceBasedErrorReporter;
import org.jetbrains.jet.lang.resolve.java.resolver.PsiBasedMethodSignatureChecker;
import org.jetbrains.jet.lang.resolve.java.resolver.PsiBasedExternalAnnotationResolver;
import org.jetbrains.jet.lang.resolve.java.JavaDescriptorResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaPackageFragmentProviderImpl;
import org.jetbrains.jet.lang.resolve.kotlin.VirtualFileFinder;
import org.jetbrains.jet.lang.descriptors.ModuleDescriptorImpl;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaAnnotationResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaAnnotationArgumentResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaClassResolver;
import org.jetbrains.jet.lang.resolve.kotlin.DeserializedDescriptorResolver;
import org.jetbrains.jet.lang.resolve.kotlin.AnnotationDescriptorDeserializer;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaFunctionResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaTypeParameterResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaTypeTransformer;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaValueParameterResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaMemberResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaConstructorResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaPropertyResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaSupertypeResolver;
import org.jetbrains.annotations.NotNull;
import javax.annotation.PreDestroy;

/* This file is generated by org.jetbrains.jet.generators.injectors.GenerateInjectors. DO NOT EDIT! */
public class InjectorForJavaDescriptorResolver {
    
    private final Project project;
    private final BindingTrace bindingTrace;
    private final JavaClassFinderImpl javaClassFinder;
    private final TraceBasedExternalSignatureResolver traceBasedExternalSignatureResolver;
    private final TraceBasedJavaResolverCache traceBasedJavaResolverCache;
    private final TraceBasedErrorReporter traceBasedErrorReporter;
    private final PsiBasedMethodSignatureChecker psiBasedMethodSignatureChecker;
    private final PsiBasedExternalAnnotationResolver psiBasedExternalAnnotationResolver;
    private final JavaDescriptorResolver javaDescriptorResolver;
    private final JavaPackageFragmentProviderImpl javaPackageFragmentProvider;
    private final VirtualFileFinder virtualFileFinder;
    private final ModuleDescriptorImpl module;
    private final JavaAnnotationResolver javaAnnotationResolver;
    private final JavaAnnotationArgumentResolver javaAnnotationArgumentResolver;
    private final JavaClassResolver javaClassResolver;
    private final DeserializedDescriptorResolver deserializedDescriptorResolver;
    private final AnnotationDescriptorDeserializer annotationDescriptorDeserializer;
    private final JavaFunctionResolver javaFunctionResolver;
    private final JavaTypeParameterResolver javaTypeParameterResolver;
    private final JavaTypeTransformer javaTypeTransformer;
    private final JavaValueParameterResolver javaValueParameterResolver;
    private final JavaMemberResolver javaMemberResolver;
    private final JavaConstructorResolver javaConstructorResolver;
    private final JavaPropertyResolver javaPropertyResolver;
    private final JavaSupertypeResolver javaSupertypeResolver;
    
    public InjectorForJavaDescriptorResolver(
        @NotNull Project project,
        @NotNull BindingTrace bindingTrace
    ) {
        this.project = project;
        this.bindingTrace = bindingTrace;
        this.javaClassFinder = new JavaClassFinderImpl();
        this.traceBasedExternalSignatureResolver = new TraceBasedExternalSignatureResolver();
        this.traceBasedJavaResolverCache = new TraceBasedJavaResolverCache();
        this.traceBasedErrorReporter = new TraceBasedErrorReporter();
        this.psiBasedMethodSignatureChecker = new PsiBasedMethodSignatureChecker();
        this.psiBasedExternalAnnotationResolver = new PsiBasedExternalAnnotationResolver();
        this.javaDescriptorResolver = new JavaDescriptorResolver();
        this.javaPackageFragmentProvider = new JavaPackageFragmentProviderImpl();
        this.virtualFileFinder = org.jetbrains.jet.lang.resolve.kotlin.VirtualFileFinder.SERVICE.getInstance(project);
        this.module = org.jetbrains.jet.lang.resolve.java.AnalyzerFacadeForJVM.createJavaModule("<fake-jdr-module>");
        this.javaAnnotationResolver = new JavaAnnotationResolver();
        this.javaAnnotationArgumentResolver = new JavaAnnotationArgumentResolver();
        this.javaClassResolver = new JavaClassResolver();
        this.deserializedDescriptorResolver = new DeserializedDescriptorResolver();
        this.annotationDescriptorDeserializer = new AnnotationDescriptorDeserializer();
        this.javaFunctionResolver = new JavaFunctionResolver();
        this.javaTypeParameterResolver = new JavaTypeParameterResolver();
        this.javaTypeTransformer = new JavaTypeTransformer();
        this.javaValueParameterResolver = new JavaValueParameterResolver();
        this.javaMemberResolver = new JavaMemberResolver();
        this.javaConstructorResolver = new JavaConstructorResolver();
        this.javaPropertyResolver = new JavaPropertyResolver();
        this.javaSupertypeResolver = new JavaSupertypeResolver();

        this.javaClassFinder.setProject(project);

        traceBasedExternalSignatureResolver.setAnnotationResolver(javaAnnotationResolver);
        traceBasedExternalSignatureResolver.setTrace(bindingTrace);

        traceBasedJavaResolverCache.setTrace(bindingTrace);

        traceBasedErrorReporter.setTrace(bindingTrace);

        psiBasedMethodSignatureChecker.setAnnotationResolver(javaAnnotationResolver);
        psiBasedMethodSignatureChecker.setExternalSignatureResolver(traceBasedExternalSignatureResolver);

        this.javaDescriptorResolver.setClassResolver(javaClassResolver);
        this.javaDescriptorResolver.setPackageFragmentProvider(javaPackageFragmentProvider);

        javaPackageFragmentProvider.setCache(traceBasedJavaResolverCache);
        javaPackageFragmentProvider.setDeserializedDescriptorResolver(deserializedDescriptorResolver);
        javaPackageFragmentProvider.setJavaClassFinder(javaClassFinder);
        javaPackageFragmentProvider.setJavaDescriptorResolver(javaDescriptorResolver);
        javaPackageFragmentProvider.setKotlinClassFinder(virtualFileFinder);
        javaPackageFragmentProvider.setMemberResolver(javaMemberResolver);
        javaPackageFragmentProvider.setModule(module);

        javaAnnotationResolver.setArgumentResolver(javaAnnotationArgumentResolver);
        javaAnnotationResolver.setClassResolver(javaClassResolver);
        javaAnnotationResolver.setExternalAnnotationResolver(psiBasedExternalAnnotationResolver);

        javaAnnotationArgumentResolver.setAnnotationResolver(javaAnnotationResolver);
        javaAnnotationArgumentResolver.setClassResolver(javaClassResolver);
        javaAnnotationArgumentResolver.setTypeTransformer(javaTypeTransformer);

        javaClassResolver.setAnnotationResolver(javaAnnotationResolver);
        javaClassResolver.setCache(traceBasedJavaResolverCache);
        javaClassResolver.setDeserializedDescriptorResolver(deserializedDescriptorResolver);
        javaClassResolver.setFunctionResolver(javaFunctionResolver);
        javaClassResolver.setJavaClassFinder(javaClassFinder);
        javaClassResolver.setKotlinClassFinder(virtualFileFinder);
        javaClassResolver.setMemberResolver(javaMemberResolver);
        javaClassResolver.setPackageFragmentProvider(javaPackageFragmentProvider);
        javaClassResolver.setSupertypesResolver(javaSupertypeResolver);
        javaClassResolver.setTypeParameterResolver(javaTypeParameterResolver);

        deserializedDescriptorResolver.setAnnotationDeserializer(annotationDescriptorDeserializer);
        deserializedDescriptorResolver.setErrorReporter(traceBasedErrorReporter);
        deserializedDescriptorResolver.setJavaPackageFragmentProvider(javaPackageFragmentProvider);

        annotationDescriptorDeserializer.setErrorReporter(traceBasedErrorReporter);
        annotationDescriptorDeserializer.setKotlinClassFinder(virtualFileFinder);

        javaFunctionResolver.setAnnotationResolver(javaAnnotationResolver);
        javaFunctionResolver.setCache(traceBasedJavaResolverCache);
        javaFunctionResolver.setErrorReporter(traceBasedErrorReporter);
        javaFunctionResolver.setExternalSignatureResolver(traceBasedExternalSignatureResolver);
        javaFunctionResolver.setSignatureChecker(psiBasedMethodSignatureChecker);
        javaFunctionResolver.setTypeParameterResolver(javaTypeParameterResolver);
        javaFunctionResolver.setTypeTransformer(javaTypeTransformer);
        javaFunctionResolver.setValueParameterResolver(javaValueParameterResolver);

        javaTypeParameterResolver.setTypeTransformer(javaTypeTransformer);

        javaTypeTransformer.setClassResolver(javaClassResolver);

        javaValueParameterResolver.setAnnotationResolver(javaAnnotationResolver);
        javaValueParameterResolver.setTypeTransformer(javaTypeTransformer);

        javaMemberResolver.setClassResolver(javaClassResolver);
        javaMemberResolver.setConstructorResolver(javaConstructorResolver);
        javaMemberResolver.setFunctionResolver(javaFunctionResolver);
        javaMemberResolver.setPropertyResolver(javaPropertyResolver);

        javaConstructorResolver.setCache(traceBasedJavaResolverCache);
        javaConstructorResolver.setExternalSignatureResolver(traceBasedExternalSignatureResolver);
        javaConstructorResolver.setTypeTransformer(javaTypeTransformer);
        javaConstructorResolver.setValueParameterResolver(javaValueParameterResolver);

        javaPropertyResolver.setAnnotationResolver(javaAnnotationResolver);
        javaPropertyResolver.setCache(traceBasedJavaResolverCache);
        javaPropertyResolver.setErrorReporter(traceBasedErrorReporter);
        javaPropertyResolver.setExternalSignatureResolver(traceBasedExternalSignatureResolver);
        javaPropertyResolver.setTypeTransformer(javaTypeTransformer);

        javaSupertypeResolver.setClassResolver(javaClassResolver);
        javaSupertypeResolver.setTypeTransformer(javaTypeTransformer);

        javaClassFinder.initialize();

    }
    
    @PreDestroy
    public void destroy() {
    }
    
    public JavaClassFinderImpl getJavaClassFinder() {
        return this.javaClassFinder;
    }
    
    public JavaDescriptorResolver getJavaDescriptorResolver() {
        return this.javaDescriptorResolver;
    }
    
    public ModuleDescriptorImpl getModule() {
        return this.module;
    }
    
}
