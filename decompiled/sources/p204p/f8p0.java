package p204p;

import com.spotify.player.model.command.SkipToPrevTrackCommand;

/* JADX INFO: loaded from: classes9.dex */
public final class f8p0 extends h8p0 {

    /* JADX INFO: renamed from: a */
    public final SkipToPrevTrackCommand f67028a;

    public f8p0(SkipToPrevTrackCommand skipToPrevTrackCommand) {
        skipToPrevTrackCommand.getClass();
        this.f67028a = skipToPrevTrackCommand;
    }

    @Override // p204p.h8p0
    /* JADX INFO: renamed from: a */
    public final Object mo25046a(brw brwVar, crw crwVar, h7u h7uVar, b5p b5pVar, k9u k9uVar, i2v i2vVar, d9p d9pVar, drw drwVar, erw erwVar, xqw xqwVar, yqw yqwVar, zqw zqwVar, arw arwVar) {
        return erwVar.mo98394apply(this);
    }

    @Override // p204p.h8p0
    /* JADX INFO: renamed from: b */
    public final void mo25047b(wx41 wx41Var, onz0 onz0Var, wx41 wx41Var2, wx41 wx41Var3, wx41 wx41Var4, kq11 kq11Var, vr11 vr11Var, prv0 prv0Var, wx41 wx41Var5, ux41 ux41Var, vx41 vx41Var, rg41 rg41Var) {
        wx41Var5.m89218a(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f8p0) {
            return ((f8p0) obj).f67028a.equals(this.f67028a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f67028a.hashCode();
    }

    /* JADX INFO: renamed from: n */
    public final SkipToPrevTrackCommand m41041n() {
        return this.f67028a;
    }

    public final String toString() {
        return "SkipToPrevTrackWithCommand{command=" + this.f67028a + '}';
    }
}
