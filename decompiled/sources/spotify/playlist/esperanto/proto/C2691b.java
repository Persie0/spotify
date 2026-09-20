package spotify.playlist.esperanto.proto;

import com.google.protobuf.AbstractC0268g;
import com.google.protobuf.AbstractC0269h;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import p204p.AbstractC2081l8;
import p204p.AbstractC2118m8;
import p204p.aux;
import p204p.ftp0;
import p204p.gva;
import p204p.kop0;
import p204p.lop0;
import p204p.ore0;
import p204p.owe;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: renamed from: spotify.playlist.esperanto.proto.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C2691b extends AbstractC0268g implements sre0 {
    /* JADX INFO: renamed from: A */
    public final void m97789A(PlaylistRange playlistRange) {
        copyOnWrite();
        PlaylistQuery.m97744x((PlaylistQuery) this.instance, playlistRange);
    }

    /* JADX INFO: renamed from: B */
    public final void m97790B(boolean z) {
        copyOnWrite();
        PlaylistQuery.m97745y((PlaylistQuery) this.instance, z);
    }

    /* JADX INFO: renamed from: C */
    public final void m97791C(kop0 kop0Var) {
        copyOnWrite();
        PlaylistQuery.m97746z((PlaylistQuery) this.instance, kop0Var);
    }

    /* JADX INFO: renamed from: D */
    public final void m97792D(ftp0 ftp0Var) {
        copyOnWrite();
        PlaylistQuery.m97729A((PlaylistQuery) this.instance, ftp0Var);
    }

    /* JADX INFO: renamed from: E */
    public final void m97793E(String str) {
        copyOnWrite();
        PlaylistQuery.m97730B((PlaylistQuery) this.instance, str);
    }

    /* JADX INFO: renamed from: F */
    public final void m97794F(int i) {
        copyOnWrite();
        PlaylistQuery.m97731C((PlaylistQuery) this.instance, i);
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
    public final void m97795m(ArrayList arrayList) {
        copyOnWrite();
        PlaylistQuery.m97734n((PlaylistQuery) this.instance, arrayList);
    }

    @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
    public final /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
        return super.mergeFrom(oweVar, auxVar);
    }

    /* JADX INFO: renamed from: q */
    public final void m97796q(ArrayList arrayList) {
        copyOnWrite();
        PlaylistQuery.m97735o((PlaylistQuery) this.instance, arrayList);
    }

    /* JADX INFO: renamed from: r */
    public final void m97797r(Iterable iterable) {
        copyOnWrite();
        PlaylistQuery.m97736p((PlaylistQuery) this.instance, iterable);
    }

    /* JADX INFO: renamed from: s */
    public final void m97798s(List list) {
        copyOnWrite();
        PlaylistQuery.m97737q((PlaylistQuery) this.instance, list);
    }

    /* JADX INFO: renamed from: t */
    public final void m97799t(PlaylistQuery.AttributeFilter attributeFilter) {
        copyOnWrite();
        PlaylistQuery.m97738r((PlaylistQuery) this.instance, attributeFilter);
    }

    /* JADX INFO: renamed from: u */
    public final void m97800u() {
        copyOnWrite();
        PlaylistQuery.m97739s((PlaylistQuery) this.instance);
    }

    /* JADX INFO: renamed from: v */
    public final void m97801v(boolean z) {
        copyOnWrite();
        PlaylistQuery.m97740t((PlaylistQuery) this.instance, z);
    }

    /* JADX INFO: renamed from: w */
    public final void m97802w(String str) {
        copyOnWrite();
        PlaylistQuery.m97741u((PlaylistQuery) this.instance, str);
    }

    /* JADX INFO: renamed from: x */
    public final void m97803x(boolean z) {
        copyOnWrite();
        PlaylistQuery.m97742v((PlaylistQuery) this.instance, z);
    }

    /* JADX INFO: renamed from: y */
    public final void m97804y(String str) {
        copyOnWrite();
        PlaylistQuery.m97743w((PlaylistQuery) this.instance, str);
    }

    /* JADX INFO: renamed from: z */
    public final void m97805z(lop0 lop0Var) {
        copyOnWrite();
        PlaylistQuery.m97744x((PlaylistQuery) this.instance, (PlaylistRange) lop0Var.build());
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
