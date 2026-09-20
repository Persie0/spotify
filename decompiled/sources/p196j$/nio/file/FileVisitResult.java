package p196j$.nio.file;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class FileVisitResult {
    public static final FileVisitResult CONTINUE;
    public static final FileVisitResult SKIP_SIBLINGS;
    public static final FileVisitResult SKIP_SUBTREE;
    public static final FileVisitResult TERMINATE;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ FileVisitResult[] f10510a;

    static {
        FileVisitResult fileVisitResult = new FileVisitResult("CONTINUE", 0);
        CONTINUE = fileVisitResult;
        FileVisitResult fileVisitResult2 = new FileVisitResult("TERMINATE", 1);
        TERMINATE = fileVisitResult2;
        FileVisitResult fileVisitResult3 = new FileVisitResult("SKIP_SUBTREE", 2);
        SKIP_SUBTREE = fileVisitResult3;
        FileVisitResult fileVisitResult4 = new FileVisitResult("SKIP_SIBLINGS", 3);
        SKIP_SIBLINGS = fileVisitResult4;
        f10510a = new FileVisitResult[]{fileVisitResult, fileVisitResult2, fileVisitResult3, fileVisitResult4};
    }

    public static FileVisitResult valueOf(String str) {
        return (FileVisitResult) Enum.valueOf(FileVisitResult.class, str);
    }

    public static FileVisitResult[] values() {
        return (FileVisitResult[]) f10510a.clone();
    }
}
