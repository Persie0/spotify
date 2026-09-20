package p204p;

import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cdo {

    /* JADX INFO: renamed from: a */
    public final DataHolder f36920a;

    /* JADX INFO: renamed from: b */
    public final int f36921b;

    /* JADX INFO: renamed from: c */
    public final int f36922c;

    public cdo(DataHolder dataHolder, int i) {
        ig31.m50506x(dataHolder);
        this.f36920a = dataHolder;
        boolean z = false;
        if (i >= 0 && i < dataHolder.f1868h) {
            z = true;
        }
        ig31.m50471A(z);
        this.f36921b = i;
        this.f36922c = dataHolder.m1502k(i);
    }

    /* JADX INFO: renamed from: a */
    public final int m32455a() {
        DataHolder dataHolder = this.f36920a;
        int i = this.f36921b;
        dataHolder.m1503n0(i, "event_type");
        return dataHolder.f1864d[this.f36922c].getInt(i, dataHolder.f1863c.getInt("event_type"));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cdo) {
            cdo cdoVar = (cdo) obj;
            if (mvl0.m62956s(Integer.valueOf(cdoVar.f36921b), Integer.valueOf(this.f36921b)) && mvl0.m62956s(Integer.valueOf(cdoVar.f36922c), Integer.valueOf(this.f36922c)) && cdoVar.f36920a == this.f36920a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f36921b), Integer.valueOf(this.f36922c), this.f36920a});
    }
}
