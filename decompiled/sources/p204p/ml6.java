package p204p;

import com.google.protobuf.Any;
import com.spotify.watchfeed.component.item.p185v2.AssociatedTextsRowComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class ml6 implements fwf {

    /* JADX INFO: renamed from: a */
    public final i4t0 f144761a;

    public ml6(h4t0 h4t0Var) {
        this.f144761a = h4t0Var;
    }

    @Override // p204p.fwf
    /* JADX INFO: renamed from: a */
    public final vwf mo32629a(Any any) {
        int i;
        AssociatedTextsRowComponent associatedTextsRowComponentM22764o = AssociatedTextsRowComponent.m22764o(any.m1913r());
        List itemsList = associatedTextsRowComponentM22764o.getItemsList();
        ArrayList arrayList = new ArrayList(i6f.m49804T(itemsList, 10));
        Iterator it = itemsList.iterator();
        while (it.hasNext()) {
            arrayList.add(((AssociatedTextsRowComponent.Item) it.next()).m22767o());
        }
        String strM43753y0 = g6f.m43753y0(arrayList, " ", null, null, null, 62);
        List<AssociatedTextsRowComponent.Item> itemsList2 = associatedTextsRowComponentM22764o.getItemsList();
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(itemsList2, 10));
        for (AssociatedTextsRowComponent.Item item : itemsList2) {
            String url = item.m22766n().m22769n().getUrl();
            String strM22898o = item.m22766n().m22769n().m22898o();
            String strM22770o = item.m22766n().m22770o();
            String strM22772q = item.m22766n().m22772q();
            String strName = item.m22766n().m22771p().name();
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
                    throw new IllegalArgumentException("No enum constant com.spotify.watchfeed.uiusecases.associatedtextsrow.ArtworkType.".concat(strName));
                }
                i = 4;
            }
            arrayList2.add(new in7(i, url, strM22898o, strM22770o, strM22772q));
        }
        return new il6(associatedTextsRowComponentM22764o.m22765n(), strM43753y0, arrayList, arrayList2);
    }

    @Override // p204p.fwf
    /* JADX INFO: renamed from: b */
    public final Class mo32630b() {
        return il6.class;
    }

    @Override // p204p.fwf
    /* JADX INFO: renamed from: c */
    public final kxf mo32631c() {
        return (kxf) this.f144761a.get();
    }
}
