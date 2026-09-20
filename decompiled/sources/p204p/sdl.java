package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class sdl {

    /* JADX INFO: renamed from: a */
    public final String f208034a;

    /* JADX INFO: renamed from: b */
    public final vdl f208035b;

    public sdl(String str, vdl vdlVar) {
        this.f208034a = str;
        this.f208035b = vdlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sdl)) {
            return false;
        }
        sdl sdlVar = (sdl) obj;
        return wj50.m88271j(this.f208034a, sdlVar.f208034a) && wj50.m88271j(this.f208035b, sdlVar.f208035b);
    }

    public final int hashCode() {
        String str = this.f208034a;
        return this.f208035b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
