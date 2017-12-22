
apply { plugin("kotlin") }

jvmTarget = "1.6"

dependencies {
    compile(project(":core:descriptors"))
    compile(project(":core:descriptors.jvm"))
    compile(project(":compiler:util"))
    compile(project(":compiler:frontend"))

    if (isClionBuild()) {
        compile(ideaSdkCoreDeps("asm-all"))
    }
}

sourceSets {
    "main" { projectDefault() }
    "test" {}
}

