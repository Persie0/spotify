package androidx.credentials.exceptions.publickeycredential;

import androidx.credentials.exceptions.GetCredentialException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialException;", "Landroidx/credentials/exceptions/GetCredentialException;", "credentials_release"}, m24213k = 1, m24214mv = {1, 8, 0}, m24216xi = 48)
public class GetPublicKeyCredentialException extends GetCredentialException {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f830d = 0;

    /* JADX INFO: renamed from: c */
    public final String f831c;

    public GetPublicKeyCredentialException(String str, CharSequence charSequence) {
        super(str, charSequence);
        this.f831c = str;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
    }

    @Override // androidx.credentials.exceptions.GetCredentialException
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF831c() {
        return this.f831c;
    }
}
