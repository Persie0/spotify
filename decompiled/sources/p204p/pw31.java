package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final class pw31 {
    public final <T> rr60 serializer(final rr60 rr60Var) {
        return new g210() { // from class: p.ow31
            private final ktz0 descriptor;

            {
                vwp0 vwp0Var = new vwp0("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", this, 2);
                vwp0Var.m86594k("keys", false);
                vwp0Var.m86594k("values", false);
                this.descriptor = vwp0Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p204p.g210
            public final rr60[] childSerializers() {
                return new rr60[]{qw31.f193157c[0].getValue(), new mj5(rr60Var, 0)};
            }

            @Override // p204p.rr60
            public final Object deserialize(fro froVar) {
                ktz0 ktz0Var = this.descriptor;
                frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
                fr70[] fr70VarArr = qw31.f193157c;
                frhVarMo29814b.getClass();
                List list = null;
                boolean z = true;
                int i = 0;
                List list2 = null;
                while (z) {
                    int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
                    if (iMo29816p == -1) {
                        z = false;
                    } else if (iMo29816p == 0) {
                        list = (List) frhVarMo29814b.mo39210A(ktz0Var, 0, (rr60) fr70VarArr[0].getValue(), list);
                        i |= 1;
                    } else {
                        if (iMo29816p != 1) {
                            throw new UnknownFieldException(iMo29816p);
                        }
                        list2 = (List) frhVarMo29814b.mo39210A(ktz0Var, 1, new mj5(rr60Var, 0), list2);
                        i |= 2;
                    }
                }
                frhVarMo29814b.mo29813a(ktz0Var);
                return new qw31(i, list, list2);
            }

            @Override // p204p.rr60
            public final ktz0 getDescriptor() {
                return this.descriptor;
            }

            @Override // p204p.rr60
            public final void serialize(deu deuVar, Object obj) {
                qw31 qw31Var = (qw31) obj;
                ktz0 ktz0Var = this.descriptor;
                hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
                hrhVarMo35820b.mo44941k(ktz0Var, 0, (rr60) qw31.f193157c[0].getValue(), qw31Var.f193159a);
                hrhVarMo35820b.mo44941k(ktz0Var, 1, new mj5(rr60Var, 0), qw31Var.f193160b);
                hrhVarMo35820b.mo44937a(ktz0Var);
            }

            @Override // p204p.g210
            public final rr60[] typeParametersSerializers() {
                return new rr60[]{rr60Var};
            }
        };
    }
}
