package p204p;

import com.spotify.player.model.command.PlayAsNextInQueueCommand;

/* JADX INFO: loaded from: classes9.dex */
public final class w7p0 extends h8p0 {

    /* JADX INFO: renamed from: a */
    public final PlayAsNextInQueueCommand f248730a;

    public w7p0(PlayAsNextInQueueCommand playAsNextInQueueCommand) {
        playAsNextInQueueCommand.getClass();
        this.f248730a = playAsNextInQueueCommand;
    }

    @Override // p204p.h8p0
    /* JADX INFO: renamed from: a */
    public final Object mo25046a(brw brwVar, crw crwVar, h7u h7uVar, b5p b5pVar, k9u k9uVar, i2v i2vVar, d9p d9pVar, drw drwVar, erw erwVar, xqw xqwVar, yqw yqwVar, zqw zqwVar, arw arwVar) {
        return k9uVar.mo98394apply(this);
    }

    @Override // p204p.h8p0
    /* JADX INFO: renamed from: b */
    public final void mo25047b(wx41 wx41Var, onz0 onz0Var, wx41 wx41Var2, wx41 wx41Var3, wx41 wx41Var4, kq11 kq11Var, vr11 vr11Var, prv0 prv0Var, wx41 wx41Var5, ux41 ux41Var, vx41 vx41Var, rg41 rg41Var) {
        wx41Var4.m89218a(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w7p0) {
            return ((w7p0) obj).f248730a.equals(this.f248730a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f248730a.hashCode();
    }

    public final String toString() {
        return "PlayAsNextInQueue{command=" + this.f248730a + '}';
    }
}
