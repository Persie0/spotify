package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dex {
    static {
        s601.m77310m0(xle.f263134a, xle.f263135b);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:38:0x0082  */
    /* JADX INFO: renamed from: a */
    public static final ArrayList m35840a(List list) {
        yle yleVar;
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            viy viyVar = (viy) it.next();
            switch (viyVar.f241807a) {
                case "podcasts-following-chip":
                    yleVar = yle.PODCASTS_FOLLOWING;
                    break;
                case "video-chip":
                    yleVar = yle.VIDEO;
                    break;
                case "music-chip":
                    yleVar = yle.MUSIC;
                    break;
                case "audiobooks-chip":
                    yleVar = yle.AUDIOBOOKS;
                    break;
                case "podcasts-chip":
                    yleVar = yle.PODCASTS;
                    break;
                case "wrapped-chip":
                    yleVar = yle.WRAPPED;
                    break;
                case "default":
                    yleVar = yle.DEFAULT;
                    break;
                case "music-following-chip":
                    yleVar = yle.MUSIC_FOLLOWING;
                    break;
                default:
                    yleVar = null;
                    break;
            }
            if (yleVar != null) {
                String str = viyVar.f241808b;
                List list2 = viyVar.f241810d;
                viyVar = new viy(yleVar.f274002a, str, yleVar.f274003b, m35840a(list2), viyVar.f241811e, viyVar.f241812f, viyVar.f241813g);
            }
            arrayList.add(viyVar);
        }
        return arrayList;
    }
}
