package p204p;

import com.google.protobuf.Any;
import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class t9d1 {

    /* JADX INFO: renamed from: a */
    public final Map f218270a;

    /* JADX INFO: renamed from: b */
    public final wg61 f218271b = new wg61(new ixb1(this, 17));

    public t9d1(xf40 xf40Var) {
        this.f218270a = xf40Var;
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList m80279a(ae50 ae50Var) {
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = ae50Var.iterator();
        while (it.hasNext()) {
            vwf vwfVarM80280b = m80280b((Any) it.next());
            if (vwfVarM80280b != null) {
                arrayList.add(vwfVarM80280b);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final vwf m80280b(Any any) {
        i4t0 i4t0Var = (i4t0) this.f218270a.get(any.m1912q());
        fwf fwfVar = i4t0Var != null ? (fwf) i4t0Var.get() : null;
        if (fwfVar != null) {
            try {
                return fwfVar.mo32629a(any);
            } catch (Exception e) {
                Logger.m3974j(e, edb.m38566o("Can't parse ", any.m1912q(), " using ", qpv0.f191387a.mo54112b(fwfVar.getClass()).mo29111F()), new Object[0]);
            }
        }
        return null;
    }
}
