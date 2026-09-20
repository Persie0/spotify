package p204p;

import com.spotify.messages.AddToPlaylist;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class t6v {

    /* JADX INFO: renamed from: a */
    public final qre0 f217611a;

    public /* synthetic */ t6v(qre0 qre0Var) {
        this.f217611a = qre0Var;
    }

    /* JADX INFO: renamed from: a */
    public void m80170a(String str, List list, String str2, String str3) {
        pl1 pl1VarM13541s = AddToPlaylist.m13541s();
        pl1VarM13541s.m70235m(list);
        pl1VarM13541s.m70236q(true);
        pl1VarM13541s.m70239t(str2);
        pl1VarM13541s.m70238s(str3);
        if (str.length() != 0) {
            pl1VarM13541s.m70237r(str);
        }
        this.f217611a.m73616a(pl1VarM13541s.build());
    }
}
