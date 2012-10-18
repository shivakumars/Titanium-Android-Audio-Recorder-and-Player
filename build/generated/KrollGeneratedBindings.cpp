/* C++ code produced by gperf version 3.0.3 */
/* Command-line: gperf -L C++ -E -t /private/var/folders/17/h190jfn55w78k880vbn4lct80000gp/T/sivakumar/audiorecorder-generated/KrollGeneratedBindings.gperf  */
/* Computed positions: -k'' */

#line 3 "/private/var/folders/17/h190jfn55w78k880vbn4lct80000gp/T/sivakumar/audiorecorder-generated/KrollGeneratedBindings.gperf"


#include <string.h>
#include <v8.h>
#include <KrollBindings.h>

#include "in.shivakumars.audiorecorder.AudiorecorderModule.h"


#line 13 "/private/var/folders/17/h190jfn55w78k880vbn4lct80000gp/T/sivakumar/audiorecorder-generated/KrollGeneratedBindings.gperf"
struct titanium::bindings::BindEntry;
/* maximum key range = 1, duplicates = 0 */

class AudiorecorderBindings
{
private:
  static inline unsigned int hash (const char *str, unsigned int len);
public:
  static struct titanium::bindings::BindEntry *lookupGeneratedInit (const char *str, unsigned int len);
};

inline /*ARGSUSED*/
unsigned int
AudiorecorderBindings::hash (register const char *str, register unsigned int len)
{
  return len;
}

struct titanium::bindings::BindEntry *
AudiorecorderBindings::lookupGeneratedInit (register const char *str, register unsigned int len)
{
  enum
    {
      TOTAL_KEYWORDS = 1,
      MIN_WORD_LENGTH = 48,
      MAX_WORD_LENGTH = 48,
      MIN_HASH_VALUE = 48,
      MAX_HASH_VALUE = 48
    };

  static struct titanium::bindings::BindEntry wordlist[] =
    {
      {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""},
      {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""},
      {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""},
      {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""},
      {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""},
      {""}, {""}, {""},
#line 15 "/private/var/folders/17/h190jfn55w78k880vbn4lct80000gp/T/sivakumar/audiorecorder-generated/KrollGeneratedBindings.gperf"
      {"in.shivakumars.audiorecorder.AudiorecorderModule", ::in::shivakumars::audiorecorder::AudiorecorderModule::bindProxy, ::in::shivakumars::audiorecorder::AudiorecorderModule::dispose}
    };

  if (len <= MAX_WORD_LENGTH && len >= MIN_WORD_LENGTH)
    {
      register int key = hash (str, len);

      if (key <= MAX_HASH_VALUE && key >= 0)
        {
          register const char *s = wordlist[key].name;

          if (*str == *s && !strcmp (str + 1, s + 1))
            return &wordlist[key];
        }
    }
  return 0;
}
#line 16 "/private/var/folders/17/h190jfn55w78k880vbn4lct80000gp/T/sivakumar/audiorecorder-generated/KrollGeneratedBindings.gperf"

