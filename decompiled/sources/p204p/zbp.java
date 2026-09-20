package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class zbp implements ho40 {

    /* JADX INFO: renamed from: b */
    public static final zbp f281355b = new zbp(0);

    /* JADX INFO: renamed from: c */
    public static final zbp f281356c = new zbp(1);

    /* JADX INFO: renamed from: d */
    public static final zbp f281357d = new zbp(2);

    /* JADX INFO: renamed from: e */
    public static final zbp f281358e = new zbp(3);

    /* JADX INFO: renamed from: f */
    public static final zbp f281359f = new zbp(4);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f281360a;

    public /* synthetic */ zbp(int i) {
        this.f281360a = i;
    }

    @Override // p204p.ho40
    /* JADX INFO: renamed from: a */
    public final jlq mo42260a(voi0 voi0Var) {
        switch (this.f281360a) {
            case 0:
                return new ybp(voi0Var);
            case 1:
                return new n2b0(voi0Var);
            case 2:
                return new lkj0();
            case 3:
                return new vay0(voi0Var);
            case 4:
                return new bby0(voi0Var);
            default:
                return new by4(voi0Var);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f281360a) {
            case 0:
                return obj == this;
            case 1:
                return obj == this;
            case 2:
                return obj == this;
            case 3:
                return obj == this;
            case 4:
                return obj == this;
            default:
                return obj == this;
        }
    }

    @Override // p204p.ho40
    public final int hashCode() {
        switch (this.f281360a) {
            case 0:
                return -1;
            case 1:
                return -1;
            case 2:
                return -5;
            case 3:
                return -1;
            case 4:
                return -1;
            default:
                return -1;
        }
    }
}
