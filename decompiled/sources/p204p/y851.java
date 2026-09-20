package p204p;

import com.spotify.mobius.Connection;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class y851 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f270212a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f270213b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y851(int i, ArrayList arrayList) {
        super(1);
        this.f270212a = i;
        this.f270213b = arrayList;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f270212a) {
            case 0:
                Iterator it = this.f270213b.iterator();
                while (it.hasNext()) {
                    ((Connection) it.next()).accept(obj);
                }
                return w2a1.f247311a;
            default:
                return new wj61(this.f270213b.indexOf((qdm) obj));
        }
    }
}
