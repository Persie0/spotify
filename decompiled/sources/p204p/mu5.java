package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class mu5 implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f147252a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f147253b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fiz f147254c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f147255d;

    public /* synthetic */ mu5(fiz fizVar, Object obj, int i, int i2) {
        this.f147252a = i2;
        this.f147254c = fizVar;
        this.f147255d = obj;
        this.f147253b = i;
    }

    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        switch (this.f147252a) {
            case 0:
                ((ay7) this.f147254c).collect(new lu5(nizVar, (uxe) this.f147255d, this.f147253b, 0), fbkVar);
                return yuk.f276404a;
            case 1:
                Object objCollect = ((yab) this.f147254c).collect(new lu5(nizVar, (String) this.f147255d, this.f147253b, 1), fbkVar);
                return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
            case 2:
                Object objCollect2 = this.f147254c.collect(new lu5(nizVar, this.f147253b, (oj80) this.f147255d, 3), fbkVar);
                return objCollect2 == yuk.f276404a ? objCollect2 : w2a1.f247311a;
            default:
                Object objCollect3 = ((pi61) this.f147254c).collect(new oi61(nizVar, (hkm0) this.f147255d, this.f147253b, 1), fbkVar);
                return objCollect3 == yuk.f276404a ? objCollect3 : w2a1.f247311a;
        }
    }

    public mu5(fiz fizVar, int i, oj80 oj80Var) {
        this.f147252a = 2;
        this.f147254c = fizVar;
        this.f147253b = i;
        this.f147255d = oj80Var;
    }
}
