package p204p;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wuc {

    /* JADX INFO: renamed from: a */
    public static final Charset f255135a = StandardCharsets.US_ASCII;

    /* JADX INFO: renamed from: b */
    public static final Charset f255136b;

    /* JADX INFO: renamed from: c */
    public static final Charset f255137c;

    static {
        Charset charset = StandardCharsets.ISO_8859_1;
        f255136b = StandardCharsets.UTF_8;
        Charset charset2 = StandardCharsets.UTF_16BE;
        Charset charset3 = StandardCharsets.UTF_16LE;
        f255137c = StandardCharsets.UTF_16;
    }
}
