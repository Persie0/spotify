package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class mtx implements sd50 {

    /* JADX INFO: renamed from: b */
    public static final mtx f147197b = new mtx(0);

    /* JADX INFO: renamed from: c */
    public static final mtx f147198c = new mtx(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f147199a;

    public /* synthetic */ mtx(int i) {
        this.f147199a = i;
    }

    @Override // p204p.sd50
    public final boolean isInRange(int i) {
        switch (this.f147199a) {
            case 0:
                return ntx.m65644b(i) != null;
            default:
                return c8l0.m31795a(i) != null;
        }
    }
}
