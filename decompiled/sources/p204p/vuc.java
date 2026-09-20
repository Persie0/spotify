package p204p;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vuc {

    /* JADX INFO: renamed from: a */
    public static final Charset f244913a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b */
    public static final Charset f244914b;

    /* JADX INFO: renamed from: c */
    public static final Charset f244915c;

    /* JADX INFO: renamed from: d */
    public static final Charset f244916d;

    /* JADX INFO: renamed from: e */
    public static final Charset f244917e;

    /* JADX INFO: renamed from: f */
    public static volatile Charset f244918f;

    /* JADX INFO: renamed from: g */
    public static volatile Charset f244919g;

    static {
        Charset.forName("UTF-16");
        f244914b = Charset.forName("UTF-16BE");
        f244915c = Charset.forName("UTF-16LE");
        f244916d = Charset.forName("US-ASCII");
        f244917e = Charset.forName("ISO-8859-1");
    }
}
