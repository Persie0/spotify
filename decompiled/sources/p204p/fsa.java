package p204p;

import androidx.car.app.serialization.BundlerException;

/* JADX INFO: loaded from: classes3.dex */
public class fsa extends BundlerException {
    /* JADX WARN: Illegal instructions before constructor call */
    public fsa(String str, esa esaVar) {
        StringBuilder sbM75191i = rbz.m75191i(str, ", frames: ");
        sbM75191i.append(esaVar.m39899a());
        super(sbM75191i.toString());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public fsa(String str, esa esaVar, Exception exc) {
        StringBuilder sbM75191i = rbz.m75191i(str, ", frames: ");
        sbM75191i.append(esaVar.m39899a());
        super(sbM75191i.toString(), exc);
    }
}
