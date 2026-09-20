package p204p;

import com.google.protobuf.AbstractC0268g;
import com.google.protobuf.AbstractC0269h;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials$AuthenticateCredentials;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials$AuthnPlatformCredential;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials$EmailAddress;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials$FacebookAccessToken;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials$GoogleSignInCredentials;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials$LegacyV3Password;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials$NativePassword;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials$NaverSignInCredentials;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials$OneTimeToken;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials$ParentChildCredentials;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials$Password;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials$PhoneNumber;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials$SamsungSignInCredentials;
import com.spotify.connectivity.auth.common.esperanto.proto.EsUnencryptedStoredCredentials$UnencryptedStoredCredentials;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class rhw extends AbstractC0268g implements sre0 {
    /* JADX INFO: renamed from: A */
    public final void m75521A(EsAuthenticateCredentials$SamsungSignInCredentials esAuthenticateCredentials$SamsungSignInCredentials) {
        copyOnWrite();
        EsAuthenticateCredentials$AuthenticateCredentials.m3509y((EsAuthenticateCredentials$AuthenticateCredentials) this.instance, esAuthenticateCredentials$SamsungSignInCredentials);
    }

    /* JADX INFO: renamed from: B */
    public final void m75522B(upw upwVar) {
        copyOnWrite();
        EsAuthenticateCredentials$AuthenticateCredentials.m3510z((EsAuthenticateCredentials$AuthenticateCredentials) this.instance, (EsUnencryptedStoredCredentials$UnencryptedStoredCredentials) upwVar.build());
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
    public final void m75523m(EsAuthenticateCredentials$AuthnPlatformCredential esAuthenticateCredentials$AuthnPlatformCredential) {
        copyOnWrite();
        EsAuthenticateCredentials$AuthenticateCredentials.m3498n((EsAuthenticateCredentials$AuthenticateCredentials) this.instance, esAuthenticateCredentials$AuthnPlatformCredential);
    }

    @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
    public final /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
        return super.mergeFrom(oweVar, auxVar);
    }

    /* JADX INFO: renamed from: q */
    public final void m75524q(EsAuthenticateCredentials$EmailAddress esAuthenticateCredentials$EmailAddress) {
        copyOnWrite();
        EsAuthenticateCredentials$AuthenticateCredentials.m3499o((EsAuthenticateCredentials$AuthenticateCredentials) this.instance, esAuthenticateCredentials$EmailAddress);
    }

    /* JADX INFO: renamed from: r */
    public final void m75525r(EsAuthenticateCredentials$FacebookAccessToken esAuthenticateCredentials$FacebookAccessToken) {
        copyOnWrite();
        EsAuthenticateCredentials$AuthenticateCredentials.m3500p((EsAuthenticateCredentials$AuthenticateCredentials) this.instance, esAuthenticateCredentials$FacebookAccessToken);
    }

    /* JADX INFO: renamed from: s */
    public final void m75526s(EsAuthenticateCredentials$GoogleSignInCredentials esAuthenticateCredentials$GoogleSignInCredentials) {
        copyOnWrite();
        EsAuthenticateCredentials$AuthenticateCredentials.m3501q((EsAuthenticateCredentials$AuthenticateCredentials) this.instance, esAuthenticateCredentials$GoogleSignInCredentials);
    }

    /* JADX INFO: renamed from: t */
    public final void m75527t(EsAuthenticateCredentials$LegacyV3Password esAuthenticateCredentials$LegacyV3Password) {
        copyOnWrite();
        EsAuthenticateCredentials$AuthenticateCredentials.m3502r((EsAuthenticateCredentials$AuthenticateCredentials) this.instance, esAuthenticateCredentials$LegacyV3Password);
    }

    /* JADX INFO: renamed from: u */
    public final void m75528u(EsAuthenticateCredentials$NativePassword esAuthenticateCredentials$NativePassword) {
        copyOnWrite();
        EsAuthenticateCredentials$AuthenticateCredentials.m3503s((EsAuthenticateCredentials$AuthenticateCredentials) this.instance, esAuthenticateCredentials$NativePassword);
    }

    /* JADX INFO: renamed from: v */
    public final void m75529v(EsAuthenticateCredentials$NaverSignInCredentials esAuthenticateCredentials$NaverSignInCredentials) {
        copyOnWrite();
        EsAuthenticateCredentials$AuthenticateCredentials.m3504t((EsAuthenticateCredentials$AuthenticateCredentials) this.instance, esAuthenticateCredentials$NaverSignInCredentials);
    }

    /* JADX INFO: renamed from: w */
    public final void m75530w(EsAuthenticateCredentials$OneTimeToken esAuthenticateCredentials$OneTimeToken) {
        copyOnWrite();
        EsAuthenticateCredentials$AuthenticateCredentials.m3505u((EsAuthenticateCredentials$AuthenticateCredentials) this.instance, esAuthenticateCredentials$OneTimeToken);
    }

    /* JADX INFO: renamed from: x */
    public final void m75531x(EsAuthenticateCredentials$ParentChildCredentials esAuthenticateCredentials$ParentChildCredentials) {
        copyOnWrite();
        EsAuthenticateCredentials$AuthenticateCredentials.m3506v((EsAuthenticateCredentials$AuthenticateCredentials) this.instance, esAuthenticateCredentials$ParentChildCredentials);
    }

    /* JADX INFO: renamed from: y */
    public final void m75532y(EsAuthenticateCredentials$Password esAuthenticateCredentials$Password) {
        copyOnWrite();
        EsAuthenticateCredentials$AuthenticateCredentials.m3507w((EsAuthenticateCredentials$AuthenticateCredentials) this.instance, esAuthenticateCredentials$Password);
    }

    /* JADX INFO: renamed from: z */
    public final void m75533z(EsAuthenticateCredentials$PhoneNumber esAuthenticateCredentials$PhoneNumber) {
        copyOnWrite();
        EsAuthenticateCredentials$AuthenticateCredentials.m3508x((EsAuthenticateCredentials$AuthenticateCredentials) this.instance, esAuthenticateCredentials$PhoneNumber);
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
