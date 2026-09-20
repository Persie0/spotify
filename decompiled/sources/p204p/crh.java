package p204p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class crh implements Connectable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41299a;

    /* JADX INFO: renamed from: b */
    public final Connectable[] f41300b;

    public /* synthetic */ crh(Connectable[] connectableArr, int i) {
        this.f41299a = i;
        this.f41300b = connectableArr;
    }

    @Override // com.spotify.mobius.Connectable
    /* JADX INFO: renamed from: P */
    public final Connection mo3269P(Consumer consumer) {
        switch (this.f41299a) {
            case 0:
                Connectable[] connectableArr = this.f41300b;
                ArrayList arrayList = new ArrayList(connectableArr.length);
                for (Connectable connectable : connectableArr) {
                    arrayList.add(connectable.mo3269P(consumer));
                }
                return new brh(1, arrayList);
            case 1:
                ArrayList arrayList2 = new ArrayList(3);
                for (int i = 0; i < 3; i++) {
                    arrayList2.add(this.f41300b[i].mo3269P(consumer));
                }
                return new brh(0, arrayList2);
            default:
                Connectable[] connectableArr2 = this.f41300b;
                ArrayList arrayList3 = new ArrayList(connectableArr2.length);
                for (Connectable connectable2 : connectableArr2) {
                    arrayList3.add(connectable2.mo3269P(consumer));
                }
                return new brh(4, arrayList3);
        }
    }
}
