package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class h9h1 extends d8h1 implements Runnable {

    /* JADX INFO: renamed from: O0 */
    public final Runnable f88979O0;

    public h9h1(Runnable runnable) {
        runnable.getClass();
        this.f88979O0 = runnable;
    }

    @Override // p204p.d8h1
    /* JADX INFO: renamed from: H */
    public final String mo35275H() {
        String string = this.f88979O0.toString();
        return dq60.m36618r(new StringBuilder(string.length() + 7), "task=[", string, "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f88979O0.run();
        } catch (Throwable th) {
            if (l8h1.f130869N0.mo38108O(this, null, new b8h1(th))) {
                d8h1.m35272J(this);
            }
            throw th;
        }
    }
}
