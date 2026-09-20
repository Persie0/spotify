package p204p;

import com.spotify.mobius.Connection;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class cu20 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42020a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f42021b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cu20(int i, ArrayList arrayList) {
        super(0);
        this.f42020a = i;
        this.f42021b = arrayList;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f42020a) {
            case 0:
                return Integer.valueOf(this.f42021b.size());
            default:
                Iterator it = this.f42021b.iterator();
                while (it.hasNext()) {
                    ((Connection) it.next()).dispose();
                }
                return w2a1.f247311a;
        }
    }
}
