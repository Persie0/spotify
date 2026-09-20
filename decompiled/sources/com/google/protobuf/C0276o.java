package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0276o extends AbstractC0274m {
    @Override // com.google.protobuf.AbstractC0274m
    /* JADX INFO: renamed from: a */
    public final C0275n mo2188a(Object obj) {
        AbstractC0269h abstractC0269h = (AbstractC0269h) obj;
        C0275n c0275n = abstractC0269h.unknownFields;
        if (c0275n != C0275n.f2481f) {
            return c0275n;
        }
        C0275n c0275n2 = new C0275n();
        abstractC0269h.unknownFields = c0275n2;
        return c0275n2;
    }

    @Override // com.google.protobuf.AbstractC0274m
    /* JADX INFO: renamed from: c */
    public final void mo2190c(Object obj, Object obj2) {
        ((AbstractC0269h) obj).unknownFields = (C0275n) obj2;
    }
}
