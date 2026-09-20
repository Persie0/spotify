package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum m5a1 {
    /* JADX INFO: Fake field, exist only in values array */
    UBYTE(uc5.m82740t("kotlin/UByte", false)),
    /* JADX INFO: Fake field, exist only in values array */
    USHORT(uc5.m82740t("kotlin/UShort", false)),
    /* JADX INFO: Fake field, exist only in values array */
    UINT(uc5.m82740t("kotlin/UInt", false)),
    /* JADX INFO: Fake field, exist only in values array */
    ULONG(uc5.m82740t("kotlin/ULong", false));


    /* JADX INFO: renamed from: a */
    public final vfe f140175a;

    /* JADX INFO: renamed from: b */
    public final qti0 f140176b;

    /* JADX INFO: renamed from: c */
    public final vfe f140177c;

    m5a1(vfe vfeVar) {
        this.f140175a = vfeVar;
        qti0 qti0VarM85358f = vfeVar.m85358f();
        this.f140176b = qti0VarM85358f;
        this.f140177c = new vfe(vfeVar.f240966a, qti0.m73841e(qti0VarM85358f.m73844b() + "Array"));
    }
}
