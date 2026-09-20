package androidx.credentials.exceptions;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Landroidx/credentials/exceptions/CreateCredentialUnsupportedException;", "Landroidx/credentials/exceptions/CreateCredentialException;", "credentials_release"}, m24213k = 1, m24214mv = {1, 8, 0}, m24216xi = 48)
public final class CreateCredentialUnsupportedException extends CreateCredentialException {
    public CreateCredentialUnsupportedException() {
        this(null);
    }

    public CreateCredentialUnsupportedException(String str) {
        super("androidx.credentials.TYPE_CREATE_CREDENTIAL_UNSUPPORTED_EXCEPTION", str);
    }
}
