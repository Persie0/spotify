package p204p;

import com.google.protobuf.Any;
import com.spotify.watchfeed.component.item.p184v1.CreatorFollowRowComponent;
import com.spotify.watchfeed.component.model.p187v1.proto.Artwork;
import com.spotify.watchfeed.component.model.p187v1.proto.LabeledCircle;

/* JADX INFO: loaded from: classes11.dex */
public final class cml implements fwf {

    /* JADX INFO: renamed from: a */
    public final i4t0 f39727a;

    public cml(h4t0 h4t0Var) {
        this.f39727a = h4t0Var;
    }

    @Override // p204p.fwf
    /* JADX INFO: renamed from: a */
    public final vwf mo32629a(Any any) {
        xll xllVar;
        int i;
        CreatorFollowRowComponent creatorFollowRowComponentM22608r = CreatorFollowRowComponent.m22608r(any.m1913r());
        String strM22610o = creatorFollowRowComponentM22608r.m22610o();
        String strM22931p = creatorFollowRowComponentM22608r.m22612q().m22931p();
        Artwork artworkM22930n = creatorFollowRowComponentM22608r.m22612q().m22930n();
        if (artworkM22930n != null) {
            String uri = artworkM22930n.getUri();
            String strName = artworkM22930n.m22880n().name();
            if (strName == null) {
                throw new NullPointerException("Name is null");
            }
            if (strName.equals("DEFAULT")) {
                i = 1;
            } else if (strName.equals("ARTIST")) {
                i = 2;
            } else if (strName.equals("SHOW")) {
                i = 3;
            } else {
                if (!strName.equals("USER")) {
                    throw new IllegalArgumentException("No enum constant com.spotify.watchfeed.components.creatorfollowrowcomponent.CreatorFollowRowComponent.ArtworkType.".concat(strName));
                }
                i = 4;
            }
            xllVar = new xll(uri, i);
        } else {
            xllVar = null;
        }
        LabeledCircle labeledCircleM22932q = creatorFollowRowComponentM22608r.m22612q().m22932q();
        return new bml(strM22610o, new aml(strM22931p, xllVar, labeledCircleM22932q != null ? new zll(labeledCircleM22932q.m22901p(), labeledCircleM22932q.m22900n()) : null), creatorFollowRowComponentM22608r.getTitle(), creatorFollowRowComponentM22608r.getSubtitle(), new yll(creatorFollowRowComponentM22608r.m22611p().m22615p(), creatorFollowRowComponentM22608r.m22611p().m22617r(), creatorFollowRowComponentM22608r.m22611p().m22614o(), creatorFollowRowComponentM22608r.m22611p().m22616q()), creatorFollowRowComponentM22608r.m22609n());
    }

    @Override // p204p.fwf
    /* JADX INFO: renamed from: b */
    public final Class mo32630b() {
        return bml.class;
    }

    @Override // p204p.fwf
    /* JADX INFO: renamed from: c */
    public final kxf mo32631c() {
        return (kxf) this.f39727a.get();
    }
}
