package io.ably.lib.types;

import com.spotify.concertcampaignview.p047v1.CtaType;
import java.io.IOException;
import java.net.NoRouteToHostException;
import java.net.UnknownHostException;
import org.msgpack.core.MessageFormat;
import org.msgpack.core.MessageUnpacker;
import p204p.qtz0;
import p204p.tx8;

/* JADX INFO: loaded from: classes16.dex */
public class ErrorInfo {
    private static final String HREF_BASE = "https://help.ably.io/error/";
    private static final String TAG = "io.ably.lib.types.ErrorInfo";
    public int code;
    public String href;
    public String message;
    public int statusCode;

    public ErrorInfo() {
    }

    public static ErrorInfo fromMsgpack(MessageUnpacker messageUnpacker) {
        return new ErrorInfo().readMsgpack(messageUnpacker);
    }

    public static ErrorInfo fromMsgpackBody(byte[] bArr) {
        return fromMsgpackBody(qtz0.f192517d.newUnpacker(bArr));
    }

    public static ErrorInfo fromResponseStatus(String str, int i) {
        return new ErrorInfo(str, i, i * 100);
    }

    public static ErrorInfo fromThrowable(Throwable th) {
        if ((th instanceof UnknownHostException) || (th instanceof NoRouteToHostException)) {
            return new ErrorInfo(th.getLocalizedMessage(), CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER, 50002);
        }
        if (th instanceof IOException) {
            return new ErrorInfo(th.getLocalizedMessage(), CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER, 50000);
        }
        return new ErrorInfo("Unexpected exception: " + th.getLocalizedMessage(), 50000, CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER);
    }

    private static String href(int i) {
        return HREF_BASE + i;
    }

    private String logMessage() {
        String str = this.message;
        if (str == null) {
            str = "";
        }
        String strHref = this.href;
        if (strHref == null) {
            int i = this.code;
            strHref = i > 0 ? href(i) : null;
        }
        if (strHref == null || str.contains(strHref)) {
            return str;
        }
        return str + " (See " + strHref + ")";
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ErrorInfo)) {
            return false;
        }
        ErrorInfo errorInfo = (ErrorInfo) obj;
        if (this.code == errorInfo.code && this.statusCode == errorInfo.statusCode) {
            String str = this.message;
            String str2 = errorInfo.message;
            if (str == str2) {
                return true;
            }
            if (str != null && str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public ErrorInfo readMsgpack(MessageUnpacker messageUnpacker) {
        int iUnpackMapHeader = messageUnpacker.unpackMapHeader();
        for (int i = 0; i < iUnpackMapHeader; i++) {
            String strIntern = messageUnpacker.unpackString().intern();
            if (!messageUnpacker.getNextFormat().equals(MessageFormat.NIL)) {
                strIntern.getClass();
                switch (strIntern) {
                    case "code":
                        this.code = messageUnpacker.unpackInt();
                        break;
                    case "href":
                        this.href = messageUnpacker.unpackString();
                        break;
                    case "statusCode":
                        this.statusCode = messageUnpacker.unpackInt();
                        break;
                    case "message":
                        this.message = messageUnpacker.unpackString();
                        break;
                    default:
                        tx8.m81897l(TAG, "Unexpected field: ".concat(strIntern));
                        messageUnpacker.skipValue();
                        break;
                }
            } else {
                messageUnpacker.unpackNil();
            }
        }
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{ErrorInfo message=");
        sb.append(logMessage());
        if (this.code > 0) {
            sb.append(" code=");
            sb.append(this.code);
        }
        if (this.statusCode > 0) {
            sb.append(" statusCode=");
            sb.append(this.statusCode);
        }
        if (this.href != null) {
            sb.append(" href=");
            sb.append(this.href);
        }
        sb.append('}');
        return sb.toString();
    }

    public ErrorInfo(String str, int i) {
        this.code = i;
        this.message = str;
    }

    private static ErrorInfo fromMsgpackBody(MessageUnpacker messageUnpacker) {
        int iUnpackMapHeader = messageUnpacker.unpackMapHeader();
        ErrorInfo errorInfoFromMsgpack = null;
        for (int i = 0; i < iUnpackMapHeader; i++) {
            String strIntern = messageUnpacker.unpackString().intern();
            if (messageUnpacker.getNextFormat().equals(MessageFormat.NIL)) {
                messageUnpacker.unpackNil();
            } else {
                strIntern.getClass();
                if (!strIntern.equals("error")) {
                    tx8.m81897l(TAG, "Unexpected field: ".concat(strIntern));
                    messageUnpacker.skipValue();
                } else {
                    errorInfoFromMsgpack = fromMsgpack(messageUnpacker);
                }
            }
        }
        return errorInfoFromMsgpack;
    }

    public ErrorInfo(String str, int i, int i2) {
        this(str, i2);
        this.statusCode = i;
        if (i2 > 0) {
            this.href = href(i2);
        }
    }
}
