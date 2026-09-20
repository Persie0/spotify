package com.spotify.login.adaptiveauthentication.challenge.whatsapp;

import android.content.Context;
import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.whatsapp.otp.android.sdk.exceptions.HandshakeIdInvalidFormatException;
import com.whatsapp.otp.android.sdk.exceptions.HandshakeIdMismatchException;
import com.whatsapp.otp.android.sdk.exceptions.HandshakeIdMissingException;
import java.util.UUID;
import kotlin.Metadata;
import p204p.hb11;
import p204p.jqd1;
import p204p.lqd1;
import p204p.mqd1;
import p204p.sk8;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m24212d2 = {"Lcom/spotify/login/adaptiveauthentication/challenge/whatsapp/WhatsappOtpReceiver;", "Lp/sk8;", "<init>", "()V", "src_main_java_com_spotify_login_adaptiveauthentication-adaptiveauthentication"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class WhatsappOtpReceiver extends sk8 {
    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    @Override // p204p.sk8
    /* JADX INFO: renamed from: a */
    public final void mo13292a(Context context, Intent intent) {
        String strTrim;
        hb11 hb11Var = mqd1.f146255a;
        String str = mqd1.f146259e;
        if (str == null) {
            Logger.m3966b("WhatsappOtpReceiver", "No handshake ID available, ignoring WhatsApp OTP intent");
            return;
        }
        lqd1 lqd1Var = lqd1.f136013a;
        try {
            String stringExtra = intent.getStringExtra("request_id");
            if (stringExtra == null) {
                strTrim = null;
            } else {
                strTrim = stringExtra.trim();
                if (strTrim.isEmpty()) {
                    strTrim = null;
                }
            }
            if (strTrim == null) {
                throw new HandshakeIdMissingException();
            }
            try {
                UUID.fromString(strTrim.trim());
                if (!strTrim.equals(str)) {
                    throw new HandshakeIdMismatchException();
                }
                String stringExtra2 = intent.getStringExtra("code");
                if (stringExtra2 == null) {
                    lqd1Var.accept(jqd1.f114895a, null);
                } else {
                    hb11 hb11Var2 = mqd1.f146255a;
                    mqd1.f146255a.mo46962a(stringExtra2);
                }
            } catch (IllegalArgumentException unused) {
                throw new HandshakeIdInvalidFormatException();
            }
        } catch (HandshakeIdInvalidFormatException e) {
            lqd1Var.accept(jqd1.f114897c, e);
        } catch (HandshakeIdMismatchException e2) {
            lqd1Var.accept(jqd1.f114898d, e2);
        } catch (HandshakeIdMissingException e3) {
            lqd1Var.accept(jqd1.f114896b, e3);
        } catch (Exception e4) {
            lqd1Var.accept(jqd1.f114899e, e4);
        }
    }
}
