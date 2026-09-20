package p204p;

import com.spotify.campfire.chatcontentpickerpage.search.domain.EntityType;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class edv {

    /* JADX INFO: renamed from: a */
    public final vmz f58595a;

    /* JADX INFO: renamed from: b */
    public ro80 f58596b;

    public edv(vmz vmzVar) {
        this.f58595a = vmzVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m38621a(ibk ibkVar) {
        ddv ddvVar;
        if (ibkVar instanceof ddv) {
            ddvVar = (ddv) ibkVar;
            int i = ddvVar.f47875c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ddvVar.f47875c = i - Integer.MIN_VALUE;
            } else {
                ddvVar = new ddv(this, ibkVar);
            }
        } else {
            ddvVar = new ddv(this, ibkVar);
        }
        Object objM86755t = ddvVar.f47873a;
        int i2 = ddvVar.f47875c;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            ro80 ro80Var = this.f58596b;
            if (ro80Var != null) {
                return ro80Var;
            }
            yab yabVar = this.f58595a.f242953a;
            ddvVar.f47875c = 1;
            objM86755t = vyf1.m86755t(yabVar, ddvVar);
            yuk yukVar = yuk.f276404a;
            if (objM86755t == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86755t);
        }
        Map map = (Map) objM86755t;
        boolean zM37244s = dxf1.m37244s("has-podcasts-available", map);
        boolean zM37246v = dxf1.m37246v(map);
        ro80 ro80VarM44508o = geg1.m44508o();
        ro80VarM44508o.add(EntityType.Artist);
        ro80VarM44508o.add(EntityType.Song);
        ro80VarM44508o.add(EntityType.Album);
        ro80VarM44508o.add(EntityType.Playlist);
        if (zM37244s) {
            ro80VarM44508o.add(EntityType.Podcast);
            ro80VarM44508o.add(EntityType.Episode);
        }
        if (zM37246v) {
            ro80VarM44508o.add(EntityType.Audiobook);
        }
        ro80 ro80VarM44506m = geg1.m44506m(ro80VarM44508o);
        this.f58596b = ro80VarM44506m;
        return ro80VarM44506m;
    }
}
