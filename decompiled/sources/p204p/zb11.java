package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.podcastexperience.showpreferencesimpl.C1242a;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public final class zb11 {

    /* JADX INFO: renamed from: a */
    public final hv31 f281205a;

    /* JADX INFO: renamed from: b */
    public final fv31 f281206b;

    /* JADX INFO: renamed from: c */
    public final hk60 f281207c;

    public zb11(p0i0 p0i0Var, rv31 rv31Var, fv31 fv31Var, Class cls) {
        this.f281205a = rv31Var;
        this.f281206b = fv31Var;
        p0i0.C2237b c2237bM68707i = p0i0Var.m68707i();
        int i = b080.f21797b;
        this.f281207c = c2237bM68707i.m68711c(new C1242a()).m68713e().m68704d(mp91.m62457j(b080.class, String.class, cls));
    }

    /* JADX INFO: renamed from: a */
    public final b080 m95814a() {
        String strMo48710e = this.f281205a.mo48710e(this.f281206b, "{}");
        if (strMo48710e == null) {
            return null;
        }
        try {
            return (b080) this.f281207c.fromJson(strMo48710e);
        } catch (IOException e) {
            Logger.m3967c(e, "Error while reading cache", new Object[0]);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m95815b(b080 b080Var) {
        try {
            String json = this.f281207c.toJson(b080Var);
            lv31 lv31VarEdit = this.f281205a.edit();
            lv31VarEdit.m60051d(this.f281206b, json);
            lv31VarEdit.m60054g();
        } catch (IOException e) {
            Logger.m3967c(e, "Error while writing cache", new Object[0]);
        }
    }
}
