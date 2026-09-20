package androidx.credentials.exceptions.publickeycredential;

import androidx.credentials.exceptions.CreateCredentialException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Landroidx/credentials/exceptions/publickeycredential/CreatePublicKeyCredentialException;", "Landroidx/credentials/exceptions/CreateCredentialException;", "credentials_release"}, m24213k = 1, m24214mv = {1, 8, 0}, m24216xi = 48)
public class CreatePublicKeyCredentialException extends CreateCredentialException {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f827d = 0;

    /* JADX INFO: renamed from: c */
    public final String f828c;

    public CreatePublicKeyCredentialException(String str, CharSequence charSequence) {
        super(str, charSequence);
        this.f828c = str;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
    }

    @Override // androidx.credentials.exceptions.CreateCredentialException
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF828c() {
        return this.f828c;
    }
}
