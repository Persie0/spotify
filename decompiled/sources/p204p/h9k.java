package p204p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: classes4.dex */
public final class h9k implements gh0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f88989a = 0;

    /* JADX INFO: renamed from: b */
    public final String f88990b;

    /* JADX INFO: renamed from: c */
    public final String f88991c;

    /* JADX INFO: renamed from: d */
    public final String f88992d;

    /* JADX INFO: renamed from: e */
    public final String f88993e;

    /* JADX INFO: renamed from: f */
    public final String f88994f;

    public h9k(jnb1 jnb1Var, yy7 yy7Var) {
        this.f88990b = jnb1Var.f114060a;
        this.f88991c = jnb1Var.f114068i;
        this.f88992d = yy7Var.f277436a;
        this.f88993e = yy7Var.f277437b;
        this.f88994f = yy7Var.f277438c;
    }

    @Override // p204p.ro0
    /* JADX INFO: renamed from: c */
    public final String mo29280c() {
        switch (this.f88989a) {
            case 0:
                break;
        }
        return this.f88993e;
    }

    @Override // p204p.gh0
    /* JADX INFO: renamed from: h */
    public final String mo29282h() {
        switch (this.f88989a) {
            case 0:
                break;
        }
        return this.f88991c;
    }

    @Override // p204p.ro0
    /* JADX INFO: renamed from: j */
    public final String mo29283j() {
        switch (this.f88989a) {
            case 0:
                break;
        }
        return this.f88992d;
    }

    @Override // p204p.gh0
    /* JADX INFO: renamed from: k */
    public final String mo29284k() {
        switch (this.f88989a) {
            case 0:
                break;
        }
        return this.f88990b;
    }

    @Override // p204p.ro0
    /* JADX INFO: renamed from: l */
    public final String mo29285l() {
        switch (this.f88989a) {
            case 0:
                break;
        }
        return this.f88994f;
    }

    public h9k(ContextTrack contextTrack) {
        String str;
        String str2 = (String) contextTrack.metadata().get(ContextTrack.Metadata.KEY_ADVERTISER);
        this.f88990b = str2 == null ? "" : str2;
        this.f88991c = (!Boolean.parseBoolean((String) contextTrack.metadata().get("is_connect_cta_enabled")) || (str = (String) contextTrack.metadata().get(ContextTrack.Metadata.KEY_CLICK_URL)) == null) ? "" : str;
        this.f88992d = "";
        String str3 = (String) contextTrack.metadata().get(ContextTrack.Metadata.KEY_AD_ID);
        this.f88993e = str3 == null ? "" : str3;
        this.f88994f = "";
    }
}
