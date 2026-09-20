package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public enum her0 {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");


    /* JADX INFO: renamed from: a */
    public final qti0 f90500a;

    /* JADX INFO: renamed from: b */
    public final qti0 f90501b;

    /* JADX INFO: renamed from: c */
    public final Object f90502c = q3d0.m72078I(2, new wul(this, 9));

    /* JADX INFO: renamed from: d */
    public final Object f90503d = q3d0.m72078I(2, new ni00(this, 28));

    /* JADX INFO: renamed from: e */
    public static final Set f90494e = s601.m77310m0(CHAR, BYTE, SHORT, INT, FLOAT, LONG, DOUBLE);

    her0(String str) {
        this.f90500a = qti0.m73841e(str);
        this.f90501b = qti0.m73841e(str.concat("Array"));
    }
}
