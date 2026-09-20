package p204p;

import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class wrh implements sje {

    /* JADX INFO: renamed from: a */
    public final Set f254358a;

    public wrh(Set set) {
        this.f254358a = set;
    }

    @Override // p204p.sje
    /* JADX INFO: renamed from: a */
    public final String mo24852a(ExternalAccessoryDescription externalAccessoryDescription) {
        Set set = this.f254358a;
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String strMo24852a = ((sje) it.next()).mo24852a(externalAccessoryDescription);
            if (strMo24852a != null) {
                arrayList.add(strMo24852a);
            }
        }
        if (arrayList.size() > 1) {
            na6.m63971s("More than one matching client context: " + externalAccessoryDescription);
        }
        return (String) g6f.m43745s0(arrayList);
    }
}
