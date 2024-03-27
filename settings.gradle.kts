rootProject.name = "patches"

buildCache {
    local {
        isEnabled = "CI" !in System.getenv()
    }
}
