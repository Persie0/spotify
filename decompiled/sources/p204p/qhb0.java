package p204p;

import com.google.protobuf.AbstractC0269h;
import com.spotify.lyrics.complianceitgc.proto.LyricsSnippetViewEvent;
import com.spotify.lyrics.complianceitgc.proto.MinimumLyricsCharactersSeen;

/* JADX INFO: loaded from: classes2.dex */
public final class qhb0 {

    /* JADX INFO: renamed from: a */
    public final qre0 f188704a;

    /* JADX INFO: renamed from: b */
    public final gcu0 f188705b;

    public qhb0(qre0 qre0Var, gcu0 gcu0Var) {
        this.f188704a = qre0Var;
        this.f188705b = gcu0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m72794a(int i, String str, String str2, sab0 sab0Var, vdb0 vdb0Var, boolean z, boolean z2) {
        AbstractC0269h abstractC0269hBuild;
        if (z) {
            vdb0Var.toString();
            zmb0 zmb0VarM13301t = LyricsSnippetViewEvent.m13301t();
            zmb0VarM13301t.m96425u(str);
            zmb0VarM13301t.m96421q(str2);
            zmb0VarM13301t.m96420m(vdb0Var.getId());
            zmb0VarM13301t.m96422r(sab0Var.getName());
            zmb0VarM13301t.m96423s(sab0Var.getId());
            zmb0VarM13301t.m96424t(y8a0.m93110o(i));
            abstractC0269hBuild = zmb0VarM13301t.build();
        } else {
            vdb0Var.toString();
            bff0 bff0VarM13310v = MinimumLyricsCharactersSeen.m13310v();
            bff0VarM13310v.m29019w(str);
            bff0VarM13310v.m29015s(str2);
            bff0VarM13310v.m29014r(vdb0Var.getId());
            bff0VarM13310v.m29016t(sab0Var.getName());
            bff0VarM13310v.m29017u(sab0Var.getId());
            bff0VarM13310v.m29018v(y8a0.m93110o(i));
            bff0VarM13310v.m29012m(((Boolean) x0h1.m89581x(dau.f47107a, new xoa0(this, null, 7))).booleanValue());
            bff0VarM13310v.m29013q(z2);
            abstractC0269hBuild = bff0VarM13310v.build();
        }
        wj50.m88279p(abstractC0269hBuild);
        this.f188704a.m73616a(abstractC0269hBuild);
    }
}
