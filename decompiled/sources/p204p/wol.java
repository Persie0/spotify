package p204p;

import com.google.protobuf.Any;
import com.spotify.watchfeed.component.item.p184v1.CreatorRowComponent;
import com.spotify.watchfeed.component.model.p187v1.proto.Artwork;
import com.spotify.watchfeed.component.model.p187v1.proto.LabeledCircle;
import com.spotify.watchfeed.component.model.p187v1.proto.Visual;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public final class wol implements fwf {

    /* JADX INFO: renamed from: a */
    public final i4t0 f253495a;

    /* JADX INFO: renamed from: b */
    public final t9d1 f253496b;

    public wol(h4t0 h4t0Var, t9d1 t9d1Var) {
        this.f253495a = h4t0Var;
        this.f253496b = t9d1Var;
    }

    @Override // p204p.fwf
    /* JADX INFO: renamed from: a */
    public final vwf mo32629a(Any any) {
        qol qolVar;
        int i;
        CreatorRowComponent creatorRowComponentM22618t = CreatorRowComponent.m22618t(any.m1913r());
        ae50 ae50VarM22620o = creatorRowComponentM22618t.m22620o();
        ae50 ae50VarM22623r = creatorRowComponentM22618t.m22623r();
        ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM22623r, 10));
        Iterator<E> it = ae50VarM22623r.iterator();
        while (true) {
            sol solVar = null;
            if (!it.hasNext()) {
                String title = creatorRowComponentM22618t.getTitle();
                vwf vwfVarM80280b = null;
                String subtitle = creatorRowComponentM22618t.getSubtitle();
                rol rolVar = creatorRowComponentM22618t.m22624s() ? new rol(creatorRowComponentM22618t.m22621p().m22628q(), creatorRowComponentM22618t.m22621p().m22627p(), creatorRowComponentM22618t.m22621p().m22630s(), creatorRowComponentM22618t.m22621p().m22626o(), creatorRowComponentM22618t.m22621p().m22629r()) : null;
                String strM22632o = creatorRowComponentM22618t.m22622q().m22632o();
                Any anyM22633p = creatorRowComponentM22618t.m22622q().m22633p();
                if (anyM22633p != null) {
                    vwfVarM80280b = this.f253496b.m80280b(anyM22633p);
                }
                return new vol(ae50VarM22620o, arrayList, title, subtitle, rolVar, new tol(strM22632o, vwfVarM80280b), creatorRowComponentM22618t.m22619n());
            }
            Visual visual = (Visual) it.next();
            String strM22931p = visual.m22934s() ? visual.m22931p() : null;
            Artwork artworkM22930n = visual.m22930n();
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
                        throw new IllegalArgumentException("No enum constant com.spotify.watchfeed.components.creatorrowcomponent.CreatorRowComponent.ArtworkType.".concat(strName));
                    }
                    i = 4;
                }
                qolVar = new qol(uri, i);
            } else {
                qolVar = null;
            }
            LabeledCircle labeledCircleM22932q = visual.m22932q();
            if (labeledCircleM22932q != null) {
                solVar = new sol(labeledCircleM22932q.m22901p(), labeledCircleM22932q.m22900n());
            }
            arrayList.add(new uol(strM22931p, qolVar, solVar));
        }
    }

    @Override // p204p.fwf
    /* JADX INFO: renamed from: b */
    public final Class mo32630b() {
        return vol.class;
    }

    @Override // p204p.fwf
    /* JADX INFO: renamed from: c */
    public final kxf mo32631c() {
        return (kxf) this.f253495a.get();
    }
}
