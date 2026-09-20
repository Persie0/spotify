package p204p;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes3.dex */
public final class end1 implements BiConsumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61144a;

    /* JADX INFO: renamed from: b */
    public Serializable f61145b;

    /* JADX INFO: renamed from: c */
    public Serializable f61146c;

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.f61144a) {
            case 0:
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                if (iIntValue == 0) {
                    this.f61145b = (Integer) obj2;
                    return;
                }
                if (iIntValue == 1) {
                    this.f61146c = (String) obj2;
                    return;
                } else {
                    if (num.intValue() >= 0) {
                        return;
                    }
                    throw new UnsupportedOperationException("The current AndroidX version doesn't support this callback value: " + num);
                }
            default:
                Integer num2 = (Integer) obj;
                ArrayList arrayList = (ArrayList) this.f61146c;
                int iIntValue2 = num2.intValue();
                if (iIntValue2 == 0) {
                    if (obj2 != null) {
                        return;
                    }
                    return;
                }
                if (iIntValue2 == 1) {
                    if (obj2 != null) {
                        return;
                    }
                    return;
                }
                if (iIntValue2 == 2) {
                    ((ArrayList) this.f61145b).add(new fnd1());
                    return;
                }
                if (iIntValue2 != 3) {
                    if (num2.intValue() >= 0) {
                        return;
                    }
                    throw new UnsupportedOperationException("The current AndroidX version doesn't support this callback value: " + num2);
                }
                if (!(obj2 instanceof List)) {
                    arrayList.add(new fnd1());
                    return;
                }
                List list = (List) obj2;
                if (list.isEmpty()) {
                    return;
                }
                arrayList.add(new fnd1());
                return;
        }
    }
}
