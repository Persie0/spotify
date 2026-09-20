package p204p;

import com.google.protobuf.AbstractC0268g;
import com.google.protobuf.AbstractC0269h;
import com.spotify.playlist.policy.proto.ItemCurationStatePolicy;
import com.spotify.playlist.policy.proto.ItemMetadataPolicy;
import com.spotify.playlist.policy.proto.ItemOfflineStateDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.UserDecorationPolicy;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class amp0 extends AbstractC0268g implements sre0 {
    /* JADX INFO: renamed from: A */
    public final void m26430A() {
        copyOnWrite();
        PlaylistItemDecorationPolicy.m18406w((PlaylistItemDecorationPolicy) this.instance);
    }

    /* JADX INFO: renamed from: B */
    public final void m26431B() {
        copyOnWrite();
        PlaylistItemDecorationPolicy.m18407x((PlaylistItemDecorationPolicy) this.instance);
    }

    /* JADX INFO: renamed from: C */
    public final void m26432C() {
        copyOnWrite();
        PlaylistItemDecorationPolicy.m18408y((PlaylistItemDecorationPolicy) this.instance);
    }

    /* JADX INFO: renamed from: D */
    public final void m26433D(boolean z) {
        copyOnWrite();
        PlaylistItemDecorationPolicy.m18409z((PlaylistItemDecorationPolicy) this.instance, z);
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
    public final void m26434m(Iterable iterable) {
        copyOnWrite();
        PlaylistItemDecorationPolicy.m18397n((PlaylistItemDecorationPolicy) this.instance, iterable);
    }

    @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
    public final /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
        return super.mergeFrom(oweVar, auxVar);
    }

    /* JADX INFO: renamed from: q */
    public final List m26435q() {
        return Collections.unmodifiableList(((PlaylistItemDecorationPolicy) this.instance).m18412D());
    }

    /* JADX INFO: renamed from: r */
    public final void m26436r() {
        copyOnWrite();
        PlaylistItemDecorationPolicy.m18398o((PlaylistItemDecorationPolicy) this.instance);
    }

    /* JADX INFO: renamed from: s */
    public final void m26437s(UserDecorationPolicy userDecorationPolicy) {
        copyOnWrite();
        PlaylistItemDecorationPolicy.m18399p((PlaylistItemDecorationPolicy) this.instance, userDecorationPolicy);
    }

    /* JADX INFO: renamed from: t */
    public final void m26438t(boolean z) {
        copyOnWrite();
        PlaylistItemDecorationPolicy.m18400q((PlaylistItemDecorationPolicy) this.instance, z);
    }

    /* JADX INFO: renamed from: u */
    public final void m26439u(sr50 sr50Var) {
        copyOnWrite();
        PlaylistItemDecorationPolicy.m18401r((PlaylistItemDecorationPolicy) this.instance, (ItemCurationStatePolicy) sr50Var.build());
    }

    /* JADX INFO: renamed from: v */
    public final void m26440v() {
        copyOnWrite();
        PlaylistItemDecorationPolicy.m18402s((PlaylistItemDecorationPolicy) this.instance);
    }

    /* JADX INFO: renamed from: w */
    public final void m26441w(ju50 ju50Var) {
        copyOnWrite();
        PlaylistItemDecorationPolicy.m18403t((PlaylistItemDecorationPolicy) this.instance, (ItemMetadataPolicy) ju50Var.build());
    }

    /* JADX INFO: renamed from: x */
    public final void m26442x() {
        copyOnWrite();
        PlaylistItemDecorationPolicy.m18404u((PlaylistItemDecorationPolicy) this.instance);
    }

    /* JADX INFO: renamed from: y */
    public final void m26443y(ItemOfflineStateDecorationPolicy itemOfflineStateDecorationPolicy) {
        copyOnWrite();
        PlaylistItemDecorationPolicy.m18405v((PlaylistItemDecorationPolicy) this.instance, itemOfflineStateDecorationPolicy);
    }

    /* JADX INFO: renamed from: z */
    public final void m26444z(ku50 ku50Var) {
        copyOnWrite();
        PlaylistItemDecorationPolicy.m18405v((PlaylistItemDecorationPolicy) this.instance, (ItemOfflineStateDecorationPolicy) ku50Var.build());
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
