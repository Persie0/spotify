package io.reactivex.rxjava3.internal.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ErrorMode {

    /* JADX INFO: renamed from: a */
    public static final ErrorMode f10254a;

    /* JADX INFO: renamed from: b */
    public static final ErrorMode f10255b;

    /* JADX INFO: renamed from: c */
    public static final ErrorMode f10256c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ ErrorMode[] f10257d;

    static {
        ErrorMode errorMode = new ErrorMode("IMMEDIATE", 0);
        f10254a = errorMode;
        ErrorMode errorMode2 = new ErrorMode("BOUNDARY", 1);
        f10255b = errorMode2;
        ErrorMode errorMode3 = new ErrorMode("END", 2);
        f10256c = errorMode3;
        f10257d = new ErrorMode[]{errorMode, errorMode2, errorMode3};
    }

    public static ErrorMode valueOf(String str) {
        return (ErrorMode) Enum.valueOf(ErrorMode.class, str);
    }

    public static ErrorMode[] values() {
        return (ErrorMode[]) f10257d.clone();
    }
}
