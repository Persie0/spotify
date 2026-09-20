package androidx.credentials.exceptions;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Landroidx/credentials/exceptions/GetCredentialCustomException;", "Landroidx/credentials/exceptions/GetCredentialException;", "credentials_release"}, m24213k = 1, m24214mv = {1, 8, 0}, m24216xi = 48)
public final class GetCredentialCustomException extends GetCredentialException {

    /* JADX INFO: renamed from: c */
    public final String f823c;

    public GetCredentialCustomException(String str, String str2) {
        super(str, str2);
        this.f823c = str;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
    }

    @Override // androidx.credentials.exceptions.GetCredentialException
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF823c() {
        return this.f823c;
    }
}
