package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ytc extends wtc {

    /* JADX INFO: renamed from: a */
    public final char f276089a;

    /* JADX INFO: renamed from: b */
    public final char f276090b;

    public ytc(char c, char c2) {
        this.f276089a = c;
        this.f276090b = c2;
    }

    @Override // p204p.duc
    /* JADX INFO: renamed from: e */
    public final boolean mo27173e(char c) {
        return c == this.f276089a || c == this.f276090b;
    }

    public final String toString() {
        return "CharMatcher.anyOf(\"" + duc.m36928a(this.f276089a) + duc.m36928a(this.f276090b) + "\")";
    }
}
