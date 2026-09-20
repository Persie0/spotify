package com.spotify.notifications.models.message;

import java.lang.reflect.Constructor;
import kotlin.Metadata;
import p204p.f0b1;
import p204p.gbu;
import p204p.hk60;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/notifications/models/message/CommunicationNotificationJsonAdapter;", "Lp/hk60;", "Lcom/spotify/notifications/models/message/CommunicationNotification;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_notifications_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class CommunicationNotificationJsonAdapter extends hk60<CommunicationNotification> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f6115a = xl60.C2578b.m91389a("sender", "conversation_id", "group", "media_attachment", "message_uri");

    /* JADX INFO: renamed from: b */
    public final hk60 f6116b;

    /* JADX INFO: renamed from: c */
    public final hk60 f6117c;

    /* JADX INFO: renamed from: d */
    public final hk60 f6118d;

    /* JADX INFO: renamed from: e */
    public final hk60 f6119e;

    /* JADX INFO: renamed from: f */
    public final hk60 f6120f;

    /* JADX INFO: renamed from: g */
    public volatile Constructor f6121g;

    public CommunicationNotificationJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f6116b = p0i0Var.m68706f(Person.class, gbuVar, "sender");
        this.f6117c = p0i0Var.m68706f(String.class, gbuVar, "conversationId");
        this.f6118d = p0i0Var.m68706f(CommunicationNotificationGroup.class, gbuVar, "group");
        this.f6119e = p0i0Var.m68706f(CommunicationNotificationMediaAttachment.class, gbuVar, "mediaAttachment");
        this.f6120f = p0i0Var.m68706f(String.class, gbuVar, "messageUri");
    }

    @Override // p204p.hk60
    public final CommunicationNotification fromJson(xl60 xl60Var) throws NoSuchMethodException {
        xl60Var.mo51076c();
        Person person = null;
        String str = null;
        CommunicationNotificationGroup communicationNotificationGroup = null;
        CommunicationNotificationMediaAttachment communicationNotificationMediaAttachment = null;
        String str2 = null;
        int i = -1;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f6115a);
            if (iMo51071K == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            } else if (iMo51071K == 0) {
                person = (Person) this.f6116b.fromJson(xl60Var);
                if (person == null) {
                    throw f0b1.m40470x("sender", "sender", xl60Var);
                }
            } else if (iMo51071K == 1) {
                str = (String) this.f6117c.fromJson(xl60Var);
                if (str == null) {
                    throw f0b1.m40470x("conversationId", "conversation_id", xl60Var);
                }
            } else if (iMo51071K == 2) {
                communicationNotificationGroup = (CommunicationNotificationGroup) this.f6118d.fromJson(xl60Var);
                i &= -5;
            } else if (iMo51071K == 3) {
                communicationNotificationMediaAttachment = (CommunicationNotificationMediaAttachment) this.f6119e.fromJson(xl60Var);
                i &= -9;
            } else if (iMo51071K == 4) {
                str2 = (String) this.f6120f.fromJson(xl60Var);
                i &= -17;
            }
        }
        xl60Var.mo51078f();
        if (i == -29) {
            String str3 = str2;
            CommunicationNotificationMediaAttachment communicationNotificationMediaAttachment2 = communicationNotificationMediaAttachment;
            CommunicationNotificationGroup communicationNotificationGroup2 = communicationNotificationGroup;
            String str4 = str;
            Person person2 = person;
            if (person2 == null) {
                throw f0b1.m40461o("sender", "sender", xl60Var);
            }
            if (str4 != null) {
                return new CommunicationNotification(person2, str4, communicationNotificationGroup2, communicationNotificationMediaAttachment2, str3);
            }
            throw f0b1.m40461o("conversationId", "conversation_id", xl60Var);
        }
        String str5 = str2;
        CommunicationNotificationMediaAttachment communicationNotificationMediaAttachment3 = communicationNotificationMediaAttachment;
        CommunicationNotificationGroup communicationNotificationGroup3 = communicationNotificationGroup;
        String str6 = str;
        Person person3 = person;
        Constructor declaredConstructor = this.f6121g;
        if (declaredConstructor == null) {
            declaredConstructor = CommunicationNotification.class.getDeclaredConstructor(Person.class, String.class, CommunicationNotificationGroup.class, CommunicationNotificationMediaAttachment.class, String.class, Integer.TYPE, f0b1.f64588c);
            this.f6121g = declaredConstructor;
        }
        if (person3 == null) {
            throw f0b1.m40461o("sender", "sender", xl60Var);
        }
        if (str6 != null) {
            return (CommunicationNotification) declaredConstructor.newInstance(person3, str6, communicationNotificationGroup3, communicationNotificationMediaAttachment3, str5, Integer.valueOf(i), null);
        }
        throw f0b1.m40461o("conversationId", "conversation_id", xl60Var);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, CommunicationNotification communicationNotification) {
        CommunicationNotification communicationNotification2 = communicationNotification;
        if (communicationNotification2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("sender");
        this.f6116b.toJson(rm60Var, communicationNotification2.sender);
        rm60Var.mo56894s("conversation_id");
        this.f6117c.toJson(rm60Var, communicationNotification2.conversationId);
        rm60Var.mo56894s("group");
        this.f6118d.toJson(rm60Var, communicationNotification2.group);
        rm60Var.mo56894s("media_attachment");
        this.f6119e.toJson(rm60Var, communicationNotification2.mediaAttachment);
        rm60Var.mo56894s("message_uri");
        this.f6120f.toJson(rm60Var, communicationNotification2.messageUri);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(47, "GeneratedJsonAdapter(CommunicationNotification)");
    }
}
