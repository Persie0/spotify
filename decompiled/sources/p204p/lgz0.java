package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lgz0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f133324a;

    /* JADX INFO: renamed from: b */
    public final List f133325b;

    /* JADX INFO: renamed from: c */
    public final boolean f133326c;

    public lgz0(ArrayList arrayList, List list, boolean z) {
        this.f133324a = arrayList;
        this.f133325b = list;
        this.f133326c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lgz0)) {
            return false;
        }
        lgz0 lgz0Var = (lgz0) obj;
        return this.f133324a.equals(lgz0Var.f133324a) && this.f133325b.equals(lgz0Var.f133325b) && this.f133326c == lgz0Var.f133326c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f133326c) + s571.m77244c(this.f133324a.hashCode() * 31, 31, this.f133325b);
    }
}
