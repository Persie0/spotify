package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class mx80 implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f147992a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fiz f147993b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aps f147994c;

    public /* synthetic */ mx80(fiz fizVar, aps apsVar, int i) {
        this.f147992a = i;
        this.f147993b = fizVar;
        this.f147994c = apsVar;
    }

    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        switch (this.f147992a) {
            case 0:
                Object objCollect = this.f147993b.collect(new lx80(nizVar, this.f147994c, 0), fbkVar);
                return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
            default:
                Object objCollect2 = this.f147993b.collect(new lx80(nizVar, this.f147994c, 1), fbkVar);
                return objCollect2 == yuk.f276404a ? objCollect2 : w2a1.f247311a;
        }
    }
}
