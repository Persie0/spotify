package p204p;

import android.os.Trace;

/* JADX INFO: loaded from: classes9.dex */
public final class snk0 implements Runnable {

    /* JADX INFO: renamed from: b */
    public static final snk0 f210954b = new snk0(0);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ snk0 f210955c = new snk0(3);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f210956a;

    public /* synthetic */ snk0(int i) {
        this.f210956a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f210956a) {
            case 0:
                whr0 whr0Var = whr0.f251426i;
                whr0.f251426i.f251432f.mo31986a(new rnk0());
                return;
            case 1:
                try {
                    int i = sa81.f207158a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (p7u.m69298d()) {
                        p7u.m69297a().m69302f();
                        break;
                    }
                    return;
                } finally {
                    int i2 = sa81.f207158a;
                    Trace.endSection();
                }
            case 2:
            case 3:
            default:
                return;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m78557a() {
    }

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ void m78558b() {
    }

    /* JADX INFO: renamed from: c */
    private final void m78559c() {
    }
}
