package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p204p.AbstractC2206o9;
import p204p.alf1;
import p204p.ig31;
import p204p.nlf1;

/* JADX INFO: loaded from: classes.dex */
public final class Scope extends AbstractC2206o9 implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new nlf1(14);

    /* JADX INFO: renamed from: a */
    public final int f1835a;

    /* JADX INFO: renamed from: b */
    public final String f1836b;

    public Scope(int i, String str) {
        ig31.m50503u(str, "scopeUri must not be null or empty");
        this.f1835a = i;
        this.f1836b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f1836b.equals(((Scope) obj).f1836b);
    }

    public final int hashCode() {
        return this.f1836b.hashCode();
    }

    public final String toString() {
        return this.f1836b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM26329l = alf1.m26329l(parcel);
        alf1.m26302H(parcel, 1, this.f1835a);
        alf1.m26308N(parcel, 2, this.f1836b);
        alf1.m26331n(iM26329l, parcel);
    }
}
