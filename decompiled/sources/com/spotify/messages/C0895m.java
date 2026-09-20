package com.spotify.messages;

import com.google.protobuf.AbstractC0268g;
import com.google.protobuf.AbstractC0269h;
import java.io.InputStream;
import java.util.LinkedHashMap;
import p204p.AbstractC2081l8;
import p204p.AbstractC2118m8;
import p204p.aux;
import p204p.gva;
import p204p.ore0;
import p204p.owe;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: renamed from: com.spotify.messages.m */
/* JADX INFO: loaded from: classes8.dex */
public final class C0895m extends AbstractC0268g implements sre0 {
    /* JADX INFO: renamed from: A */
    public final void m15031A(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth.m14647y((UbiProd1ImpressionNonAuth) this.instance, str);
    }

    /* JADX INFO: renamed from: B */
    public final void m15032B(C0896n c0896n) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth.m14648z((UbiProd1ImpressionNonAuth) this.instance, (UbiProd1ImpressionNonAuth.SourcePaths) c0896n.build());
    }

    /* JADX INFO: renamed from: C */
    public final void m15033C(LinkedHashMap linkedHashMap) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth.m14618A((UbiProd1ImpressionNonAuth) this.instance).putAll(linkedHashMap);
    }

    /* JADX INFO: renamed from: D */
    public final void m15034D(String str) {
        str.getClass();
        copyOnWrite();
        UbiProd1ImpressionNonAuth.m14618A((UbiProd1ImpressionNonAuth) this.instance).put("source_paths_unavailable_reason", str);
    }

    /* JADX INFO: renamed from: E */
    public final void m15035E(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth.m14619B((UbiProd1ImpressionNonAuth) this.instance, str);
    }

    /* JADX INFO: renamed from: F */
    public final void m15036F(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth.m14620C((UbiProd1ImpressionNonAuth) this.instance, str);
    }

    /* JADX INFO: renamed from: G */
    public final void m15037G(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth.m14621D((UbiProd1ImpressionNonAuth) this.instance, str);
    }

    /* JADX INFO: renamed from: H */
    public final void m15038H(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth.m14622E((UbiProd1ImpressionNonAuth) this.instance, str);
    }

    /* JADX INFO: renamed from: I */
    public final void m15039I(int i) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth.m14623F((UbiProd1ImpressionNonAuth) this.instance, i);
    }

    /* JADX INFO: renamed from: J */
    public final void m15040J(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth.m14624G((UbiProd1ImpressionNonAuth) this.instance, str);
    }

    /* JADX INFO: renamed from: K */
    public final void m15041K(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth.m14625H((UbiProd1ImpressionNonAuth) this.instance, str);
    }

    /* JADX INFO: renamed from: L */
    public final void m15042L(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth.m14626I((UbiProd1ImpressionNonAuth) this.instance, str);
    }

    /* JADX INFO: renamed from: M */
    public final void m15043M(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth.m14627J((UbiProd1ImpressionNonAuth) this.instance, str);
    }

    /* JADX INFO: renamed from: N */
    public final void m15044N(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth.m14628K((UbiProd1ImpressionNonAuth) this.instance, str);
    }

    /* JADX INFO: renamed from: O */
    public final void m15045O(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth.m14629L((UbiProd1ImpressionNonAuth) this.instance, str);
    }

    /* JADX INFO: renamed from: P */
    public final void m15046P(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth.m14630M((UbiProd1ImpressionNonAuth) this.instance, str);
    }

    /* JADX INFO: renamed from: Q */
    public final void m15047Q(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth.m14631N((UbiProd1ImpressionNonAuth) this.instance, str);
    }

    /* JADX INFO: renamed from: R */
    public final void m15048R() {
        copyOnWrite();
        UbiProd1ImpressionNonAuth.m14632O((UbiProd1ImpressionNonAuth) this.instance);
    }

    /* JADX INFO: renamed from: S */
    public final void m15049S(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth.m14633P((UbiProd1ImpressionNonAuth) this.instance, str);
    }

    /* JADX INFO: renamed from: T */
    public final void m15050T(long j) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth.m14634Q((UbiProd1ImpressionNonAuth) this.instance, j);
    }

    @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
    public final /* bridge */ /* synthetic */ pre0 build() {
        return build();
    }

    @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
    public final /* bridge */ /* synthetic */ pre0 buildPartial() {
        return super.buildPartial();
    }

    @Override // com.google.protobuf.AbstractC0268g
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ ore0 mo98325clear() {
        return mo98325clear();
    }

    @Override // com.google.protobuf.AbstractC0268g
    /* JADX INFO: renamed from: clone */
    public final /* bridge */ /* synthetic */ Object mo98328clone() {
        return super.mo98326clone();
    }

    @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
    public final /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
        return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
    }

    /* JADX INFO: renamed from: m */
    public final void m15051m(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth.m14636n((UbiProd1ImpressionNonAuth) this.instance, str);
    }

    @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
    public final /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
        return super.mergeFrom(oweVar, auxVar);
    }

    /* JADX INFO: renamed from: q */
    public final void m15052q(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth.m14637o((UbiProd1ImpressionNonAuth) this.instance, str);
    }

    /* JADX INFO: renamed from: r */
    public final void m15053r(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth.m14638p((UbiProd1ImpressionNonAuth) this.instance, str);
    }

    /* JADX INFO: renamed from: s */
    public final void m15054s(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth.m14639q((UbiProd1ImpressionNonAuth) this.instance, str);
    }

    /* JADX INFO: renamed from: t */
    public final void m15055t(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth.m14640r((UbiProd1ImpressionNonAuth) this.instance, str);
    }

    /* JADX INFO: renamed from: u */
    public final void m15056u(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth.m14641s((UbiProd1ImpressionNonAuth) this.instance, str);
    }

    /* JADX INFO: renamed from: v */
    public final void m15057v(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth.m14642t((UbiProd1ImpressionNonAuth) this.instance, str);
    }

    /* JADX INFO: renamed from: w */
    public final void m15058w(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth.m14643u((UbiProd1ImpressionNonAuth) this.instance, str);
    }

    /* JADX INFO: renamed from: x */
    public final void m15059x(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth.m14644v((UbiProd1ImpressionNonAuth) this.instance, str);
    }

    /* JADX INFO: renamed from: y */
    public final void m15060y(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth.m14645w((UbiProd1ImpressionNonAuth) this.instance, str);
    }

    /* JADX INFO: renamed from: z */
    public final void m15061z(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth.m14646x((UbiProd1ImpressionNonAuth) this.instance, str);
    }

    @Override // com.google.protobuf.AbstractC0268g
    /* JADX INFO: renamed from: clone */
    public final /* bridge */ /* synthetic */ AbstractC2081l8 mo98327clone() {
        return super.mo98326clone();
    }

    @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
    /* JADX INFO: renamed from: mergeFrom */
    public final /* bridge */ /* synthetic */ AbstractC2081l8 mo98329mergeFrom(byte[] bArr, int i, int i2) {
        return super.mo98329mergeFrom(bArr, i, i2);
    }

    @Override // com.google.protobuf.AbstractC0268g
    /* JADX INFO: renamed from: clone */
    public final /* bridge */ /* synthetic */ ore0 mo98327clone() {
        return super.mo98326clone();
    }

    @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
    /* JADX INFO: renamed from: mergeFrom */
    public final /* bridge */ /* synthetic */ AbstractC2081l8 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
        return super.mo98330mergeFrom(bArr, i, i2, auxVar);
    }

    @Override // p204p.AbstractC2081l8
    /* JADX INFO: renamed from: mergeFrom */
    public final /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
        return super.mo98371mergeFrom(inputStream);
    }

    @Override // p204p.AbstractC2081l8
    /* JADX INFO: renamed from: mergeFrom */
    public final /* bridge */ /* synthetic */ ore0 mo98372mergeFrom(InputStream inputStream, aux auxVar) {
        return super.mo98372mergeFrom(inputStream, auxVar);
    }

    @Override // p204p.AbstractC2081l8
    /* JADX INFO: renamed from: mergeFrom */
    public final /* bridge */ /* synthetic */ ore0 mo98373mergeFrom(gva gvaVar) {
        return super.mo98373mergeFrom(gvaVar);
    }

    @Override // p204p.AbstractC2081l8
    /* JADX INFO: renamed from: mergeFrom */
    public final /* bridge */ /* synthetic */ ore0 mo98374mergeFrom(gva gvaVar, aux auxVar) {
        return super.mo98374mergeFrom(gvaVar, auxVar);
    }

    @Override // p204p.AbstractC2081l8
    /* JADX INFO: renamed from: mergeFrom */
    public final /* bridge */ /* synthetic */ ore0 mo98375mergeFrom(owe oweVar) {
        return super.mo98375mergeFrom(oweVar);
    }

    @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
    public final /* bridge */ /* synthetic */ ore0 mergeFrom(owe oweVar, aux auxVar) {
        return super.mergeFrom(oweVar, auxVar);
    }

    @Override // p204p.AbstractC2081l8, p204p.ore0
    public final /* bridge */ /* synthetic */ ore0 mergeFrom(pre0 pre0Var) {
        return super.mergeFrom(pre0Var);
    }

    @Override // p204p.AbstractC2081l8
    /* JADX INFO: renamed from: mergeFrom */
    public final /* bridge */ /* synthetic */ ore0 mo98376mergeFrom(byte[] bArr) {
        return super.mo98376mergeFrom(bArr);
    }

    @Override // com.google.protobuf.AbstractC0268g
    /* JADX INFO: renamed from: mergeFrom */
    public final /* bridge */ /* synthetic */ ore0 mo98329mergeFrom(byte[] bArr, int i, int i2) {
        return super.mo98329mergeFrom(bArr, i, i2);
    }

    @Override // com.google.protobuf.AbstractC0268g
    /* JADX INFO: renamed from: mergeFrom */
    public final /* bridge */ /* synthetic */ ore0 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
        return super.mo98330mergeFrom(bArr, i, i2, auxVar);
    }

    @Override // p204p.AbstractC2081l8
    /* JADX INFO: renamed from: mergeFrom */
    public final /* bridge */ /* synthetic */ ore0 mo98377mergeFrom(byte[] bArr, aux auxVar) {
        return super.mo98377mergeFrom(bArr, auxVar);
    }
}
