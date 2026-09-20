package p204p;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class sd60 implements rr60 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f207900a;

    /* JADX INFO: renamed from: b */
    public final mtz0 f207901b;

    public sd60(int i) {
        this.f207900a = i;
        switch (i) {
            case 1:
                this.f207901b = gjg1.m44907F("android.os.Parcelable", new ktz0[0]);
                break;
            default:
                this.f207901b = gjg1.m44907F("java.io.Serializable", new ktz0[0]);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public Parcelable m77821a(fro froVar) {
        if (!(froVar instanceof u8y0)) {
            throw new IllegalArgumentException(y0h1.m92570h(this.f207901b.f147207a, froVar).toString());
        }
        u8y0 u8y0Var = (u8y0) froVar;
        Bundle bundle = u8y0Var.f228038c;
        String str = u8y0Var.f228040e;
        Parcelable parcelable = (Parcelable) zn91.m96523K(bundle, str, ((ife) qpv0.f191387a.mo54112b(Parcelable.class)).mo28587A());
        if (parcelable != null) {
            return parcelable;
        }
        cuf1.m33916p(str);
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public Serializable m77822b(fro froVar) {
        if (!(froVar instanceof u8y0)) {
            throw new IllegalArgumentException(y0h1.m92570h(this.f207901b.f147207a, froVar).toString());
        }
        u8y0 u8y0Var = (u8y0) froVar;
        Bundle bundle = u8y0Var.f228038c;
        String str = u8y0Var.f228040e;
        Serializable serializableM96526N = zn91.m96526N(bundle, str, ((ife) qpv0.f191387a.mo54112b(Serializable.class)).mo28587A());
        if (serializableM96526N != null) {
            return serializableM96526N;
        }
        cuf1.m33916p(str);
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public void m77823c(deu deuVar, Parcelable parcelable) {
        if (!(deuVar instanceof v8y0)) {
            throw new IllegalArgumentException(y0h1.m92571i(this.f207901b.f147207a, deuVar).toString());
        }
        v8y0 v8y0Var = (v8y0) deuVar;
        v8y0Var.f238756c.putParcelable(v8y0Var.f238758e, parcelable);
    }

    /* JADX INFO: renamed from: d */
    public void m77824d(deu deuVar, Serializable serializable) {
        if (!(deuVar instanceof v8y0)) {
            throw new IllegalArgumentException(y0h1.m92571i(this.f207901b.f147207a, deuVar).toString());
        }
        v8y0 v8y0Var = (v8y0) deuVar;
        v8y0Var.f238756c.putSerializable(v8y0Var.f238758e, serializable);
    }

    @Override // p204p.rr60
    public final /* bridge */ /* synthetic */ Object deserialize(fro froVar) {
        switch (this.f207900a) {
            case 0:
                return m77822b(froVar);
            default:
                return m77821a(froVar);
        }
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        switch (this.f207900a) {
            case 0:
                break;
        }
        return this.f207901b;
    }

    @Override // p204p.rr60
    public final /* bridge */ /* synthetic */ void serialize(deu deuVar, Object obj) {
        switch (this.f207900a) {
            case 0:
                m77824d(deuVar, (Serializable) obj);
                break;
            default:
                m77823c(deuVar, (Parcelable) obj);
                break;
        }
    }
}
