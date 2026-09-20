package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class kwo extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f127134a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mwo f127135b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kwo(mwo mwoVar, int i) {
        super(0);
        this.f127134a = i;
        this.f127135b = mwoVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f127134a) {
            case 0:
                ((gh00) this.f127135b.f147829b).invoke(vg3.f241111i);
                break;
            case 1:
                ((gh00) this.f127135b.f147829b).invoke(vg3.f241107e);
                break;
            case 2:
                ((gh00) this.f127135b.f147829b).invoke(vg3.f241106d);
                break;
            default:
                ((gh00) this.f127135b.f147829b).invoke(vg3.f241110h);
                break;
        }
        return w2a1.f247311a;
    }
}
