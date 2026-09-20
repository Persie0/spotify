package p204p;

import android.os.Parcelable;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class xcl0 implements Parcelable {
    public final String getUri() {
        if (this instanceof ocl0) {
            return ((ocl0) this).f163951a;
        }
        if (this instanceof qcl0) {
            return ((qcl0) this).f187383a.getId();
        }
        if (this instanceof pcl0) {
            return ((pcl0) this).f176172a;
        }
        if (this instanceof ncl0) {
            return ((ncl0) this).f152557a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
