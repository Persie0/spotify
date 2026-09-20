package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class xtc extends wtc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f265833a;

    /* JADX INFO: renamed from: b */
    public final char f265834b;

    public /* synthetic */ xtc(char c, int i) {
        this.f265833a = i;
        this.f265834b = c;
    }

    @Override // p204p.duc
    /* JADX INFO: renamed from: e */
    public final boolean mo27173e(char c) {
        switch (this.f265833a) {
            case 0:
                return c == this.f265834b;
            default:
                return c != this.f265834b;
        }
    }

    @Override // p204p.wtc, p204p.duc
    /* JADX INFO: renamed from: f */
    public final duc mo27174f() {
        switch (this.f265833a) {
            case 0:
                return new xtc(this.f265834b, 1);
            default:
                return new xtc(this.f265834b, 0);
        }
    }

    public final String toString() {
        switch (this.f265833a) {
            case 0:
                return "CharMatcher.is('" + duc.m36928a(this.f265834b) + "')";
            default:
                return "CharMatcher.isNot('" + duc.m36928a(this.f265834b) + "')";
        }
    }
}
