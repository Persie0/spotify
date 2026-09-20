package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class n5q extends dgy0 {

    /* JADX INFO: renamed from: d */
    public static final n5q f150595d;

    static {
        int i = mv61.f147522c;
        int i2 = mv61.f147523d;
        long j = mv61.f147524e;
        String str = mv61.f147520a;
        n5q n5qVar = new n5q();
        n5qVar.f48918c = new wuk(i, j, str, i2);
        f150595d = n5qVar;
    }

    @Override // p204p.luk
    /* JADX INFO: renamed from: Q */
    public final luk mo40637Q(int i) {
        jh3.m53313d(i);
        return i >= mv61.f147522c ? this : super.mo40637Q(i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // p204p.luk
    public final String toString() {
        return "Dispatchers.Default";
    }
}
