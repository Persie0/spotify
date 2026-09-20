package com.spotify.messages;

import com.google.protobuf.AbstractC0268g;
import com.google.protobuf.AbstractC0269h;
import java.io.InputStream;
import java.util.Map;
import p204p.AbstractC2081l8;
import p204p.AbstractC2118m8;
import p204p.aux;
import p204p.gva;
import p204p.ore0;
import p204p.owe;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: renamed from: com.spotify.messages.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C0891i extends AbstractC0268g implements sre0 {
    /* JADX INFO: renamed from: A */
    public final void m14987A(String str) {
        copyOnWrite();
        UbiProd1Impression.m14602y((UbiProd1Impression) this.instance, str);
    }

    /* JADX INFO: renamed from: B */
    public final void m14988B(C0892j c0892j) {
        copyOnWrite();
        UbiProd1Impression.m14603z((UbiProd1Impression) this.instance, (UbiProd1Impression.SourcePaths) c0892j.build());
    }

    /* JADX INFO: renamed from: C */
    public final void m14989C(Map map) {
        copyOnWrite();
        UbiProd1Impression.m14570A((UbiProd1Impression) this.instance).putAll(map);
    }

    /* JADX INFO: renamed from: D */
    public final void m14990D(String str) {
        str.getClass();
        copyOnWrite();
        UbiProd1Impression.m14570A((UbiProd1Impression) this.instance).put("source_paths_unavailable_reason", str);
    }

    /* JADX INFO: renamed from: E */
    public final void m14991E(String str) {
        copyOnWrite();
        UbiProd1Impression.m14571B((UbiProd1Impression) this.instance, str);
    }

    /* JADX INFO: renamed from: F */
    public final void m14992F(String str) {
        copyOnWrite();
        UbiProd1Impression.m14572C((UbiProd1Impression) this.instance, str);
    }

    /* JADX INFO: renamed from: G */
    public final void m14993G(String str) {
        copyOnWrite();
        UbiProd1Impression.m14573D((UbiProd1Impression) this.instance, str);
    }

    /* JADX INFO: renamed from: H */
    public final void m14994H(String str) {
        copyOnWrite();
        UbiProd1Impression.m14574E((UbiProd1Impression) this.instance, str);
    }

    /* JADX INFO: renamed from: I */
    public final void m14995I(int i) {
        copyOnWrite();
        UbiProd1Impression.m14575F((UbiProd1Impression) this.instance, i);
    }

    /* JADX INFO: renamed from: J */
    public final void m14996J(String str) {
        copyOnWrite();
        UbiProd1Impression.m14576G((UbiProd1Impression) this.instance, str);
    }

    /* JADX INFO: renamed from: K */
    public final void m14997K(long j) {
        copyOnWrite();
        UbiProd1Impression.m14577H((UbiProd1Impression) this.instance, j);
    }

    /* JADX INFO: renamed from: L */
    public final void m14998L(long j) {
        copyOnWrite();
        UbiProd1Impression.m14578I((UbiProd1Impression) this.instance, j);
    }

    /* JADX INFO: renamed from: M */
    public final void m14999M(String str) {
        copyOnWrite();
        UbiProd1Impression.m14579J((UbiProd1Impression) this.instance, str);
    }

    /* JADX INFO: renamed from: N */
    public final void m15000N(String str) {
        copyOnWrite();
        UbiProd1Impression.m14580K((UbiProd1Impression) this.instance, str);
    }

    /* JADX INFO: renamed from: O */
    public final void m15001O() {
        copyOnWrite();
        UbiProd1Impression.m14581L((UbiProd1Impression) this.instance);
    }

    /* JADX INFO: renamed from: P */
    public final void m15002P(String str) {
        copyOnWrite();
        UbiProd1Impression.m14582M((UbiProd1Impression) this.instance, str);
    }

    /* JADX INFO: renamed from: Q */
    public final void m15003Q(String str) {
        copyOnWrite();
        UbiProd1Impression.m14583N((UbiProd1Impression) this.instance, str);
    }

    /* JADX INFO: renamed from: R */
    public final void m15004R(String str) {
        copyOnWrite();
        UbiProd1Impression.m14584O((UbiProd1Impression) this.instance, str);
    }

    /* JADX INFO: renamed from: S */
    public final void m15005S(String str) {
        copyOnWrite();
        UbiProd1Impression.m14585P((UbiProd1Impression) this.instance, str);
    }

    /* JADX INFO: renamed from: T */
    public final void m15006T(String str) {
        copyOnWrite();
        UbiProd1Impression.m14586Q((UbiProd1Impression) this.instance, str);
    }

    /* JADX INFO: renamed from: U */
    public final void m15007U() {
        copyOnWrite();
        UbiProd1Impression.m14587R((UbiProd1Impression) this.instance);
    }

    /* JADX INFO: renamed from: V */
    public final void m15008V(String str) {
        copyOnWrite();
        UbiProd1Impression.m14588S((UbiProd1Impression) this.instance, str);
    }

    /* JADX INFO: renamed from: W */
    public final void m15009W(long j) {
        copyOnWrite();
        UbiProd1Impression.m14589T((UbiProd1Impression) this.instance, j);
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
    public final void m15010m(String str) {
        copyOnWrite();
        UbiProd1Impression.m14591n((UbiProd1Impression) this.instance, str);
    }

    @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
    public final /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
        return super.mergeFrom(oweVar, auxVar);
    }

    /* JADX INFO: renamed from: q */
    public final void m15011q(String str) {
        copyOnWrite();
        UbiProd1Impression.m14592o((UbiProd1Impression) this.instance, str);
    }

    /* JADX INFO: renamed from: r */
    public final void m15012r(String str) {
        copyOnWrite();
        UbiProd1Impression.m14593p((UbiProd1Impression) this.instance, str);
    }

    /* JADX INFO: renamed from: s */
    public final void m15013s(String str) {
        copyOnWrite();
        UbiProd1Impression.m14594q((UbiProd1Impression) this.instance, str);
    }

    /* JADX INFO: renamed from: t */
    public final void m15014t(String str) {
        copyOnWrite();
        UbiProd1Impression.m14595r((UbiProd1Impression) this.instance, str);
    }

    /* JADX INFO: renamed from: u */
    public final void m15015u(String str) {
        copyOnWrite();
        UbiProd1Impression.m14596s((UbiProd1Impression) this.instance, str);
    }

    /* JADX INFO: renamed from: v */
    public final void m15016v(String str) {
        copyOnWrite();
        UbiProd1Impression.m14597t((UbiProd1Impression) this.instance, str);
    }

    /* JADX INFO: renamed from: w */
    public final void m15017w(String str) {
        copyOnWrite();
        UbiProd1Impression.m14598u((UbiProd1Impression) this.instance, str);
    }

    /* JADX INFO: renamed from: x */
    public final void m15018x(String str) {
        copyOnWrite();
        UbiProd1Impression.m14599v((UbiProd1Impression) this.instance, str);
    }

    /* JADX INFO: renamed from: y */
    public final void m15019y(String str) {
        copyOnWrite();
        UbiProd1Impression.m14600w((UbiProd1Impression) this.instance, str);
    }

    /* JADX INFO: renamed from: z */
    public final void m15020z(String str) {
        copyOnWrite();
        UbiProd1Impression.m14601x((UbiProd1Impression) this.instance, str);
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
